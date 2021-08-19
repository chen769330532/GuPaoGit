package com.example.demo.secondday.strategy;

/**
 * Created by Chenjl
 * 2021/8/19 23:14
 */
public interface IDiscountType {

    IDiscount chooseType(String type);
}
