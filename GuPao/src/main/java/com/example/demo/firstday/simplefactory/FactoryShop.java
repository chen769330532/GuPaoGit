package com.example.demo.firstday.simplefactory;

public class FactoryShop {

    public Shop createShop(FactoryShopEnum factoryShopEnum){
        switch (factoryShopEnum){
            case PHONE:return new Phone();
            case COMPUTER:return new Computer();
            default:return null;
        }
    }
}
