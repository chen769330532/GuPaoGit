package com.example.demo.secondday.decorator.v1;

public class MouseDecorator extends MotherboardDecorator {

    private Motherboard motherboard;

    public MouseDecorator(Motherboard motherboard) {
        super(motherboard);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "鼠标一个";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }
}
