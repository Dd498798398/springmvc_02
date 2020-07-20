package com.guigu.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhanglaoshi
 * @date 2020/7/17 11:11
 */
public class FirstInterceptor implements HandlerInterceptor {
    /**
     * 该方法在目标方法调用之前被调用，如果为 true 则继续调用，后续拦截器和方法。
     *  若为 false ，则停止继续调用。
     *  */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行了------preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行了------postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("执行了------afterCompletion");
    }
}
