package com.example.demo.firstday.simplefactory;

import com.example.demo.firstday.Shop;

public class Test {

    public static void main(String[] args) {
        FactoryShop factoryShop = new FactoryShop();
        Shop shop = factoryShop.createShop(FactoryShopEnum.COMPUTER);
        shop.sold();
    }
}
