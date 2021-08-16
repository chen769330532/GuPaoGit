package com.example.demo.firstday.simplefactory;

public enum FactoryShopEnum {

    COMPUTER("电脑店"),PHONE("手机店");

    private String shopName;


    FactoryShopEnum(String shopName) {
        this.shopName=shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
