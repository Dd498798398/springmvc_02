package com.guigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhanglaoshi
 * @date 2020/7/17 16:47
 */
@Controller
public class TestMVCException {

    @RequestMapping(value = "/testException01")
    public String TestException01(@RequestParam("id") int id) {
        System.out.println("开始");
        int a = 0;
        try {
            a = 10 / id;
        } catch (Exception e) {
            throw new ArithmeticException();
        }
        System.out.println("a = " + a);
        System.out.println("结束");
        return "hello";
    }


}

