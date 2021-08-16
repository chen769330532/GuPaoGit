package com.example.demo.firstday.factorymethod;

import com.example.demo.firstday.ElectronicShop;

public class FactoryMethodTest {

    //方法工厂模式
    //符合单一职责
    public static void main(String[] args) {
        IFactoryShop iFactoryShop = new ComputerShopFactory();
        ElectronicShop electronicShop = iFactoryShop.create();
        electronicShop.sold();
    }
}
