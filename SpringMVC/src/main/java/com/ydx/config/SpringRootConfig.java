package com.ydx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @ClassName SpringRootConfig
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/30 22:42
 * @Version 1.0
 **/
// Spring容器不扫描Controller，父容器
@ComponentScan(value = "com.ydx", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
})
public class SpringRootConfig {
}
