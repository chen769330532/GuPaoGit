package com.example.demo.secondday.decorator.v1;

public class Test {

    //装饰器模式 迭代加强  主要特征:子类构造方法引用父类
    public static void main(String[] args) {
        Motherboard motherboard = new MotherboardDecorator(new BaseMotherBoard());
        System.out.println(motherboard.getMsg() + "总价 :" + motherboard.getPrice());

        motherboard = new MouseDecorator(motherboard);
        System.out.println(motherboard.getMsg() + "总价 :" + motherboard.getPrice());

        motherboard = new KeyBoardDecorator(motherboard);
        System.out.println(motherboard.getMsg() + "总价 :" + motherboard.getPrice());

    }
}
