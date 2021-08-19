package com.example.demo.secondday.proxy.v3;

import com.example.demo.secondday.proxy.v1.IProxy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Chenjl
 * 2021/8/18 0:13
 */
public class CglibProxy implements MethodInterceptor {

    public Object getInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();

    }

    //代理类要继承我们的代理类,生成的.class文件比较多.所以生成的时候比较慢,但是基于fassclass机制,所以直接通过index下标找到代理类,所以速度比较快

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object invoke = methodProxy.invokeSuper(o, objects);
        after();
        return invoke;
    }


    private void after() {
        System.out.println("代理后");
    }

    private void before() {
        System.out.println("代理前");
    }
}
