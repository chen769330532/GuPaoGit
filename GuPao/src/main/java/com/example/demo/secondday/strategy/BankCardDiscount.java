package com.example.demo.secondday.strategy;

/**
 * Created by Chenjl
 * 2021/8/19 22:39
 */
public class BankCardDiscount implements IDiscount {

    private Integer money = 200;

    @Override
    public String discountType(Integer originalPrice) {
        return "原价:"+originalPrice+",优惠后价格:"+(originalPrice-money);
    }
}
