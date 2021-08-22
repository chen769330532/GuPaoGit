package com.example.demo.thirdday.observer.v2;

import com.google.common.eventbus.EventBus;

/**
 * Created by Chenjl
 * 2021/8/22 20:01
 */
public class GuavaTest {

    //观察者模式属于行为性模式
    //观察者模式是松耦合的,符合依赖倒置原则
    //分离了表示层(观察者)和数据逻辑层(被观察者),并且建立了一套逻辑响应机制,使得数据的可以响应到多个表示层
    //实现了一对多的机制,支持事件注册,支持兴趣分布机制,当被观察者触发事件的时候,只有感兴趣的观察者能接收信息

    //缺点.当观察者数量过多的时候,通知时间会边长
    //当其中一个观察者卡壳的时候,会影响到后续观察者的事件
    //当观察者和被观察者有互相依赖的关系的时候,容易导致系统崩溃
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        GuavaEvent1 guavaEvent1 = new GuavaEvent1();
        eventBus.register(guavaEvent);
        eventBus.register(guavaEvent1);
        eventBus.post("tom");
    }
}
