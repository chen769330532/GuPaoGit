package com.example.demo.firstday.singleton;

public enum  SingleTonEnum {

    /**
     * 写法优雅,但是浪费资源,底层用map封装,默认加载
     */
    LAZY;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SingleTonEnum getInstance(){
        return LAZY;
    }

}
