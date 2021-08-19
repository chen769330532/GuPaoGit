package com.example.demo.secondday.decorator.v1;

public class Test {

    //装饰器模式 迭代加强  主要特征:子类构造方法引用父类作为参数
    //在构造函数中,一定会有一个当前类继承的对象入参作为参数传入,最终一定会调用玩传入的函数的方法,
    //但是我们可以在调用前和调用后做一些动作
    public static void main(String[] args) {
        Motherboard motherboard = new MotherboardDecorator(new BaseMotherBoard());
        System.out.println(motherboard.getMsg() + "总价 :" + motherboard.getPrice());

        motherboard = new MouseDecorator(motherboard);
        System.out.println(motherboard.getMsg() + "总价 :" + motherboard.getPrice());

        motherboard = new KeyBoardDecorator(motherboard);
        System.out.println(motherboard.getMsg() + "总价 :" + motherboard.getPrice());

    }
}
