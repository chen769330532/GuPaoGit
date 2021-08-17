package com.example.demo.secondday.proxy.v2;

import com.example.demo.secondday.proxy.v1.IProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Chenjl
 * 2021/8/17 23:25
 */


public class JDKProxy implements InvocationHandler {

    private IProxy target;

    public IProxy getInstance(IProxy iProxy) {
        this.target = iProxy;
        Class<? extends IProxy> clazz = target.getClass();
        return (IProxy) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("代理后");
    }

    private void before() {
        System.out.println("代理前");
    }


}
