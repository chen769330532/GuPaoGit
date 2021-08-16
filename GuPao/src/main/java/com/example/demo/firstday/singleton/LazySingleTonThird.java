package com.example.demo.firstday.singleton;

public class LazySingleTonThird {

    private static LazySingleTonThird lazySingleTonSecond ;

    private LazySingleTonThird(){

    }

    /**
     * 优点 性能提高 线程安全了
     * 缺点 可读性难度加大  不够优雅
     * @return
     */
    private  static LazySingleTonThird getInstance(){

        if(lazySingleTonSecond ==null ){
            synchronized (LazySingleTonThird.class){
                if(lazySingleTonSecond ==null ){
                    return new LazySingleTonThird();
                }
            }
        }
        return lazySingleTonSecond;
    }

}
