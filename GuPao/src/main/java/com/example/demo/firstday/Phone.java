package com.example.demo.firstday;

public class Phone implements Shop {

    @Override
    public void sold() {
        System.out.println("出售手机");
    }
}
