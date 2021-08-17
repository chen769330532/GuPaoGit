package com.example.demo.secondday.proxy.v3;

import com.example.demo.secondday.proxy.v1.IProxy;
import com.example.demo.secondday.proxy.v1.Proxy;

/**
 * Created by Chenjl
 * 2021/8/18 0:18
 */
public class Test {

    public static void main(String[] args) {
        IProxy instance = (IProxy) new CglibProxy().getInstance(Proxy.class);
        instance.getMsg();
    }
}
