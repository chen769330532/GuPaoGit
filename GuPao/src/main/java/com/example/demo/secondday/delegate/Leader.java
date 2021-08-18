package com.example.demo.secondday.delegate;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chenjl
 * 2021/8/18 23:35
 */
public class Leader implements Emp {

    Map<String,Emp> map = new HashMap<>();

    public Leader(){
        map.put("编程",new EmpPeopleA());
        map.put("画画",new EmpPeopleB());
    }

    @Override
    public String task(String task) {
        if(StringUtils.isEmpty(task)){
            return "领导忘记安排工作";
        }
        if(!map.containsKey(task)){
            return"没有员工能完成这个任务";
        }
        return map.get(task).task(task);
    }
}
