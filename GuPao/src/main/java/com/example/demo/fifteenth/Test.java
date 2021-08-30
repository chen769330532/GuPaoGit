package com.example.demo.fifteenth;

import java.util.concurrent.FutureTask;

/**
 * Created by Chenjl
 * 2021/8/30 22:07
 */
public class Test {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        ThreadTestTwo threadTestTwo = new ThreadTestTwo();
        ThreadThird threadThird  = new ThreadThird();
        FutureTask futureTask = new FutureTask(threadThird);
        threadTest.start();
        new Thread(threadTestTwo).start();
        new Thread(futureTask,"123").start();
    }
}
