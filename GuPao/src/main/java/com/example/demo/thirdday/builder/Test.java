package com.example.demo.thirdday.builder;

/**
 * Created by Chenjl
 * 2021/8/19 23:49
 */
public class Test {

    public static void main(String[] args) {
        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.setBotherName("dd");
        homeBuilder.setFatherName("ff");
        homeBuilder.setMotherName("mm");
        homeBuilder.setSisterName("ss");
        Home home = homeBuilder.build();
        System.out.println(home);

    }
}
