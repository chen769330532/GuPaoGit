package com.example.demo.firstday.singleton;

public class LazySingleTonSecond {

    private static LazySingleTonSecond lazySingleTonSecond ;

    private LazySingleTonSecond(){

    }

    /**
     * 线程安全 节省资源
     * @return
     */
    private synchronized  static  LazySingleTonSecond getInstance(){
        if(lazySingleTonSecond ==null ){
            return new LazySingleTonSecond();
        }
        return lazySingleTonSecond;
    }

}
