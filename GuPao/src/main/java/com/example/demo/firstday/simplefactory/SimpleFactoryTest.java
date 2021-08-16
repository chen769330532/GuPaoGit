package com.example.demo.firstday.simplefactory;

import com.example.demo.firstday.ElectronicShop;

public class SimpleFactoryTest {

    //简单工厂模式
    //不符合单一职责
    public static void main(String[] args) {
        FactoryShop factoryShop = new FactoryShop();
        ElectronicShop electronicShop = factoryShop.createShop(FactoryShopEnum.COMPUTER);
        electronicShop.sold();
    }
}
