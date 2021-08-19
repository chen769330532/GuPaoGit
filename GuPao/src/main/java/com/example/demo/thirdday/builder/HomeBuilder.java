package com.example.demo.thirdday.builder;

/**
 * Created by Chenjl
 * 2021/8/19 23:44
 */
public class HomeBuilder {

    private Home home = new Home();

    public void setFatherName(String fatherName){
        home.setFatherName(fatherName);
    }

    public void setMotherName(String motherName){
        home.setMotherName(motherName);
    }
    public void setSisterName(String sisterName){
        home.setSisterName(sisterName);
    }
    public void setBotherName(String botherName){
        home.setBotherName(botherName);
    }

    public Home build(){
        return home;
    }
}
