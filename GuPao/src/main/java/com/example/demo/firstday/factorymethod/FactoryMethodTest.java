package com.example.demo.firstday.factorymethod;

import com.example.demo.firstday.Shop;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IFactoryShop iFactoryShop = new ComputerShopFactory();
        Shop shop = iFactoryShop.create();
        shop.sold();
    }
}
