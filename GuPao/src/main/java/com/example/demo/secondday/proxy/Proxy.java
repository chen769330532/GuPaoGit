package com.example.demo.secondday.proxy;

public class Proxy implements IProxy{

    @Override
    public void getMsg() {
        System.out.println("代理中");
    }
}
