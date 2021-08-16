package com.example.demo.firstday.factorymethod;

import com.example.demo.firstday.Computer;
import com.example.demo.firstday.ElectronicShop;

public class ComputerShopFactory implements IFactoryShop{

    @Override
    public ElectronicShop create() {
        return new Computer();
    }
}
