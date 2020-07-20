package com.guigu.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhanglaoshi
 * @date 2020/7/17 17:53
 */
@ControllerAdvice
public class TestMVCHandleException {

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView handlerArithmeticException(Exception e) {
        System.out.println("出异常了");
        ModelAndView modelAndView = new ModelAndView("exception");
        return modelAndView;
    }

    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView nullPointerExceptionHandler(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", e.toString());
        mv.setViewName("exception");
        return mv;
    }
}
