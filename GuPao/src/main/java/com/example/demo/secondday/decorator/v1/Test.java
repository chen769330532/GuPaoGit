package com.example.demo.secondday.decorator.v1;

public class Test {

    public static void main(String[] args) {
        Motherboard motherboard = new MotherboardDecorator(new BaseMotherBoard());
        System.out.println(motherboard.getMsg() + "总价 :" + motherboard.getPrice());

        motherboard = new MouseDecorator(motherboard);
        System.out.println(motherboard.getMsg() + "总价 :" + motherboard.getPrice());

        motherboard = new KeyBoardDecorator(motherboard);
        System.out.println(motherboard.getMsg() + "总价 :" + motherboard.getPrice());

    }
}
