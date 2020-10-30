package com.ydx;

import com.ydx.config.SpringMVCConfig;
import com.ydx.config.SpringRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @ClassName MyWebAppInitializer
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/30 22:31
 * @Version 1.0
 **/
// web容器启动时候创建对象，调用方法初始化容器和前端控制器
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // 获取根容器配置类；（Spring配置文件） 父容器
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringRootConfig.class};
    }
    // 获取web容器配置类（SpringMVC配置文件） 子容器
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }
    // 获取DispatcherServlet映射信息
    // /:拦截所有请求包静态资源，但是不包括*.jsp
    // /* ：拦截所有请求包静态资源，且包括*.jsp，jsp页面是tomcat的jsp引擎解析的
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
