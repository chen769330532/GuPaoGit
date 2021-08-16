package com.example.demo.firstday.abstractfactory;

import com.example.demo.firstday.ElectronicShop;

public interface IFactoryShop {

    ElectronicShop sellElectronic();

    FoodShop sellFood();
}
