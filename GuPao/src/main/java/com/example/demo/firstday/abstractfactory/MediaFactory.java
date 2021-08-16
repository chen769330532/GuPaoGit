package com.example.demo.firstday.abstractfactory;

import com.example.demo.firstday.ElectronicShop;

public  class MediaFactory implements IFactoryShop{

    @Override
    public ElectronicShop sellElectronic() {
        return null;
    }

    @Override
    public FoodShop sellFood() {
        return null;
    }
}
