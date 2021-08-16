package com.example.demo.firstday.simplefactory;

public class Computer implements Shop{

    @Override
    public void sold() {
        System.out.println("出售电脑");
    }
}
