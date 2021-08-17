package com.example.demo.secondday.decorator.v1;

public class MotherboardDecorator extends Motherboard {

    private Motherboard motherboard;

    public MotherboardDecorator(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String getMsg() {
        return this.motherboard.getMsg();
    }

    @Override
    public int getPrice() {
        return this.motherboard.getPrice();
    }
}
