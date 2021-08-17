package com.example.demo.secondday.proxy.v1;

public class Test {

    //跟装饰器有点像,装饰器是规定一个主模板,然后迭代加强
    //代理模式 代理继承父类的某个类作为构造参数 实现里面的方法
    public static void main(String[] args) {
        IProxy iProxy = new RealProxy(new Proxy());
        iProxy.getMsg();

    }
}
