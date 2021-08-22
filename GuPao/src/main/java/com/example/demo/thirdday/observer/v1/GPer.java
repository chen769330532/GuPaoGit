package com.example.demo.thirdday.observer.v1;

import java.util.Observable;

/**
 * Created by Chenjl
 * 2021/8/22 16:54
 */
public class GPer extends Observable {

    private static GPer gPer = null;

    private String name = "GPer生态圈";


    private GPer (){

    }

    public static GPer getInstance(){
        if (gPer == null){
            gPer = new GPer();
        }
        return gPer;
    }

    public void askedQuestion(Question question){
        System.out.println("学生"+question.getStudentName()+"在GPer上,提交了一个问题:"+question.getContent());
        notifyObservers(question);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
