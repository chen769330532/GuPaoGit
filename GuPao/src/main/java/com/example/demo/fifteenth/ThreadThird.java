package com.example.demo.fifteenth;

import java.util.concurrent.Callable;

/**
 * Created by Chenjl
 * 2021/8/30 22:05
 */
public class ThreadThird implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(123);
        return null;
    }
}
