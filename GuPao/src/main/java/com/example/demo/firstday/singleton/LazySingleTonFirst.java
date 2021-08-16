package com.example.demo.firstday.singleton;

public class LazySingleTonFirst {

    private static final LazySingleTonFirst lazySingleTon = null;

    private LazySingleTonFirst(){

    }

    /**
     * 优点:节省内存
     * 缺点:并发情况下可能创建多个
     * @return
     */
    public static LazySingleTonFirst getInstance(){
        if(lazySingleTon==null){
            return new LazySingleTonFirst();
        }
        return lazySingleTon;
    }
}
