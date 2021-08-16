package com.example.demo.firstday.simplefactory;

public class Test {

    public static void main(String[] args) {
        FactoryShop factoryShop = new FactoryShop();
        Shop shop = factoryShop.createShop(FactoryShopEnum.COMPUTER);
        shop.sold();
    }
}
