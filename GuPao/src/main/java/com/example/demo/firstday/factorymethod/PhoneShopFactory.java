package com.example.demo.firstday.factorymethod;

import com.example.demo.firstday.Phone;
import com.example.demo.firstday.Shop;

public class PhoneShopFactory implements IFactoryShop{
    @Override
    public Shop create() {
        return new Phone();
    }
}
