package com.example.demo.firstday.simplefactory;

import com.example.demo.firstday.Computer;
import com.example.demo.firstday.Phone;
import com.example.demo.firstday.Shop;

public class FactoryShop {

    public Shop createShop(FactoryShopEnum factoryShopEnum){
        switch (factoryShopEnum){
            case PHONE:return new Phone();
            case COMPUTER:return new Computer();
            default:return null;
        }
    }
}
