package com.example.demo.secondday.decorator.v1;

public class BaseMotherBoard extends Motherboard {

    @Override
    public String getMsg() {
        return "主板一个";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
