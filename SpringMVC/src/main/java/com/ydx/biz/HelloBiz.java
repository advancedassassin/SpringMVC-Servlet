package com.ydx.biz;

import org.springframework.stereotype.Service;

/**
 * @ClassName HelloBiz
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/30 22:49
 * @Version 1.0
 **/
@Service
public class HelloBiz {

    public String sayHello(String name){
        return "Hello" + name;
    }

}
