package com.example.demo.firstday;

public class Phone implements ElectronicShop {

    @Override
    public void sold() {
        System.out.println("出售手机");
    }
}
