package com.example.demo.firstday.factorymethod;

import com.example.demo.firstday.Phone;
import com.example.demo.firstday.ElectronicShop;

public class PhoneShopFactory implements IFactoryShop{
    @Override
    public ElectronicShop create() {
        return new Phone();
    }
}
