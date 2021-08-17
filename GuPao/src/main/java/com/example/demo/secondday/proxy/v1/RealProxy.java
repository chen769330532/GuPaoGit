package com.example.demo.secondday.proxy.v1;

public class RealProxy implements IProxy {

    private IProxy iProxy;

    public RealProxy(IProxy iProxy){
        this.iProxy=iProxy;
    }

    @Override
    public void getMsg() {
        before();
        iProxy.getMsg();
        after();
    }

    private void after() {
        System.out.println("代理后");
    }

    private void before() {
        System.out.println("代理前");
    }
}
