package com.example.demo.secondday.proxy.v1;

public class Proxy implements IProxy{

    @Override
    public void getMsg() {
        System.out.println("代理中");
    }
}
