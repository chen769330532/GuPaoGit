package com.example.demo.secondday.delegate;

/**
 * Created by Chenjl
 * 2021/8/18 23:33
 */
public class EmpPeopleB implements Emp{

    String goodAt = "设计";

    @Override
    public String task(String task) {
        return "我擅长"+goodAt+",现在被安排完成"+task;
    }
}
