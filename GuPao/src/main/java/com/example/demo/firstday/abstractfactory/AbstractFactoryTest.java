package com.example.demo.firstday.abstractfactory;

public class AbstractFactoryTest {

    //抽象工厂模式
    //不符合开闭原则
    //思路 大厂 能卖食物 能卖电子产品 其中有美的和格力两个大厂 想要美的的电脑 就先找美的工厂下售卖电子产品的工厂在找到对应的店铺买电脑
    public static void main(String[] args) {
        //美的
        IFactoryShop mediaFactory = new MediaFactory();
        mediaFactory.sellElectronic();
        mediaFactory.sellFood();

        //格力
        IFactoryShop greeShopFactory = new GreeShopFactory();
        greeShopFactory.sellFood();
        greeShopFactory.sellElectronic();
    }
}
