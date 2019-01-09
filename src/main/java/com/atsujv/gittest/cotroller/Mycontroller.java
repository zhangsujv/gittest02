package com.atsujv.gittest.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
