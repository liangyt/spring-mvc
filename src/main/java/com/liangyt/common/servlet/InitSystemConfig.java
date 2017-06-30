package com.liangyt.common.servlet;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 描述：系统全局类
 *
 * @author liangyt
 * @创建时间 2017-06-23 07:22
 */
@SuppressWarnings("all")
@Component
@Lazy(false) // 不延迟执行
public class InitSystemConfig implements ServletContextAware, ApplicationContextAware {
    public static ServletContext servletContext;
    public static ApplicationContext appCtx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.appCtx = applicationContext;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
        servletContext.setAttribute("ctx", servletContext.getContextPath());
    }
}
