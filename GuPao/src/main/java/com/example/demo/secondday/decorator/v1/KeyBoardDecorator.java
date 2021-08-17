package com.example.demo.secondday.decorator.v1;

public class KeyBoardDecorator extends MotherboardDecorator {

    private Motherboard motherboard;

    public KeyBoardDecorator(Motherboard motherboard) {
        super(motherboard);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "键盘一个";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }
}
