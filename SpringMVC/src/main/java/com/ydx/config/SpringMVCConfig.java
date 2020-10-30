package com.ydx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @ClassName SpringMVCConfig
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/30 22:42
 * @Version 1.0
 **/
// SpringMVC只扫描Controller；子容器,注意只扫描,useDefaultFilters = false默认过滤规则禁用
@ComponentScan(value = "com.ydx", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
},useDefaultFilters = false)
public class SpringMVCConfig {
}
