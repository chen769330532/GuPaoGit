package com.example.demo.secondday.delegate;

/**
 * Created by Chenjl
 * 2021/8/18 23:43
 */
public class Test {

    //委派模式 注重结果 和代理模式注重过程不一样
    //理解思路:  1个员工擅长设计 一个员工擅长画画,他们两是属于一个领导,
    // 领导只会安排他们会做的任务,所以boss找到这个领导相当于安排这个领导员工完成任务至于是谁完成不是重点
    //所以当boss安排了一个这个领导下属可以完成的任务的时候
    //这个领导会找到对应能解决这个问题的员工去解决问题
    public static void main(String[] args) {
        System.out.println(new Boss().command("编程", new Leader()));
        System.out.println(new Boss().command("画画", new Leader()));

    }
}
