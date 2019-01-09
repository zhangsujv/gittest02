package com.atsujv.gittest.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangSujv
 * @Description
 * @ClassName Mycontroller
 * @Date 2019/1/8 - 21:37
 */
@RestController
public class Mycontroller {
    @GetMapping(value = "hello")
    public String hello(){
        return "Hello World!!!";
    }


    //ceshi chongtu de tijao
    @GetMapping(value = "map")
    public Map<String,String> map(){
        Map<String,String> map = new HashMap<>();
        map.put("my","我的");
        map.put("your","你的");
        return map;
    }
}
