package com.example.demo.secondday.proxy.v2;

import com.example.demo.secondday.proxy.v1.IProxy;
import com.example.demo.secondday.proxy.v1.Proxy;
import com.example.demo.secondday.proxy.v1.RealProxy;

/**
 * Created by Chenjl
 * 2021/8/17 23:28
 */
public class Test {

    //动态代理
    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        IProxy instance = jdkProxy.getInstance(new Proxy());
        instance.getMsg();
    }
}
