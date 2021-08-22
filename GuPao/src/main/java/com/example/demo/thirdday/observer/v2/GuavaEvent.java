package com.example.demo.thirdday.observer.v2;

import com.google.common.eventbus.Subscribe;

/**
 * Created by Chenjl
 * 2021/8/22 20:00
 */
public class GuavaEvent {

    @Subscribe
    public void guavaTest(String str){
        System.out.println("测试guava:"+str);
    }
}
