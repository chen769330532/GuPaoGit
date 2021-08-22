package com.example.demo.thirdday.observer.v1;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Chenjl
 * 2021/8/22 17:12
 */
public class Teacher implements Observer {

    private String teacherName;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Teacher(String teacherName){
        this.teacherName=teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question) arg;
        System.out.println("============");
        System.out.println(teacherName +"老师您好:GPer上有一个学生名字叫"+question.getStudentName()+"像你询问了一个问题:"+question.getContent());
        System.out.println("============");
    }
}
