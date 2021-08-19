package com.example.demo.secondday.strategy;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Chenjl
 * 2021/8/19 22:48
 */
public class DiscountImpl {

    private Map<String,IDiscount> map =new ConcurrentHashMap<>(16);

    private Integer originalPrice = 10000;

    public DiscountImpl(){
        map.put("JD",new JDDiscount());
        map.put("IPay",new IPayDiscount());
        map.put("Bank",new BankCardDiscount());
    }

    public String getAfterDiscountPrice(String discountType){
        if(!map.containsKey(discountType)){
            return "非法入侵";
        }
        return  map.get(discountType).discountType(originalPrice);
    }
}
