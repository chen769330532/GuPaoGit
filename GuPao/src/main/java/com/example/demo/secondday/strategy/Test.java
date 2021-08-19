package com.example.demo.secondday.strategy;

/**
 * Created by Chenjl
 * 2021/8/19 22:54
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(new DiscountImpl().getAfterDiscountPrice("JD"));
        System.out.println(new DiscountImpl().getAfterDiscountPrice("IPay"));
        System.out.println(new DiscountImpl().getAfterDiscountPrice("Bank"));
    }
}
