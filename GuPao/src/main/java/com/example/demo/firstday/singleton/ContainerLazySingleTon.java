package com.example.demo.firstday.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerLazySingleTon {

    private Map<String, Object> ioc = new ConcurrentHashMap<>(16);

    private Object getInstance(String name) {
        if (!ioc.containsKey(name)) {
            Object object = null;
            try {
                object = Class.forName(name).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ioc.put(name, object);
            return object;
        } else {
            return ioc.get(name);
        }
    }
}
