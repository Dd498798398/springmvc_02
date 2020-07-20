package com.guigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class Test {
    /**
     * 模拟 NullPointerException
     */
    @RequestMapping("/show1")
    public String showInfo() {
        String str = null;
        str.length();
        return "index";
    }

    @RequestMapping(value = "/testException02")
    public String TestException02(Map<String, String> map) {
        map.put("exception", "到了异常页面");
        return "exception";
    }

    /**
     * 模拟 ArithmeticException
     */
    @RequestMapping("/show2")
    public String showInfo2() {
        int a = 10 / 0;
        return "index";
    }


}
