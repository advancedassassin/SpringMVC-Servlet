package com.ydx.controller;

import com.ydx.biz.HelloBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/30 22:47
 * @Version 1.0
 **/
@Controller
public class HelloController {

    @Autowired
    HelloBiz helloBiz;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        String s = helloBiz.sayHello("tomcat...");
        return s;
    }

}
