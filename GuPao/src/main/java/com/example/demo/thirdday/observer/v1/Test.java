package com.example.demo.thirdday.observer.v1;

/**
 * Created by Chenjl
 * 2021/8/22 17:16
 */
public class Test {

    public static void main(String[] args) {

        //观察者实现Observer接口
        Teacher teacher = new Teacher("Tom");

        //被观察者继承Observable
        GPer gPer = GPer.getInstance();

        gPer.addObserver(teacher);

        Question question = new Question();
        question.setStudentName("陈俊良");
        question.setContent("老师您几岁?");

        teacher.update(gPer,question);

    }
}
