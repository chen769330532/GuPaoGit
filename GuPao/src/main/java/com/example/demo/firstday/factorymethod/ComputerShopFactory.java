package com.example.demo.firstday.factorymethod;

import com.example.demo.firstday.Computer;
import com.example.demo.firstday.Shop;

public class ComputerShopFactory implements IFactoryShop{

    @Override
    public Shop create() {
        return new Computer();
    }
}
