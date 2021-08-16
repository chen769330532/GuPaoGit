package com.example.demo.firstday.singleton;

public class LazySingleTonFourth {

    private LazySingleTonFourth() {
        if (LazyInnerClass.lazySingleTonFourth != null) {
            throw new RuntimeException("不允许非常访问");
        }
    }

    private LazySingleTonFourth getInstance() {
        return LazyInnerClass.lazySingleTonFourth;
    }

    /**
     * 优点:写法优雅 性能高
     * 缺点:可以被反射破坏
     * 饥饿单例: 加载.class文件  只会加载主类 只有调用对应的方法才会生成内部类.class文件
     */
    private static class LazyInnerClass {
        private static final LazySingleTonFourth lazySingleTonFourth = new LazySingleTonFourth();
    }
}
