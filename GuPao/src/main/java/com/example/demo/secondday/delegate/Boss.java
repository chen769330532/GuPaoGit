package com.example.demo.secondday.delegate;

/**
 * Created by Chenjl
 * 2021/8/18 23:42
 */
public class Boss {

    public String command(String task,Leader leader){
        return leader.task(task);
    }
}
