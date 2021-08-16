package com.example.demo.firstday.singleton;

public class HungerSingleTon {

    private static final HungerSingleTon hungerSingleTon = new HungerSingleTon();

    private HungerSingleTon(){

    }

    /**
     * 优点:执行效率高,性能高,没有锁
     * 缺点:某些情况下,内存浪费
     * @return
     */
    public static HungerSingleTon getInstance(){
        return hungerSingleTon;
    }
}
