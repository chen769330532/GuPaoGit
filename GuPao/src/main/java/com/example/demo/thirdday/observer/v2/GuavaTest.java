package com.example.demo.thirdday.observer.v2;

import com.google.common.eventbus.EventBus;

/**
 * Created by Chenjl
 * 2021/8/22 20:01
 */
public class GuavaTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("tom");
    }
}
