package com.ydx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Callable;

/**
 * @ClassName AsyncController
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/31 10:27
 * @Version 1.0
 **/
@Controller
public class AsyncController {

    @ResponseBody
    @RequestMapping("/async01")
    public Callable<String> async01(){

        System.out.println(Thread.currentThread()+"主线程开始..."+System.currentTimeMillis());

        Callable<String> callable = new Callable<String>() {
            public String call() throws Exception {
                System.out.println(Thread.currentThread()+"副线程开始..."+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println(Thread.currentThread()+"副线程结束..."+System.currentTimeMillis());
                return "Callable<String> async01()";
            }
        };
        System.out.println(Thread.currentThread()+"主线程结束..."+System.currentTimeMillis());
        return callable;
    }

}
