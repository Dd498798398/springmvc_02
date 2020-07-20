package com.guigu.controller;

import com.guigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanglaoshi
 * @date 2020/7/13 9:51
 */
@Controller
public class HelloController {

    public static final String HELLO = "hello";

    @RequestMapping(value = "/hello")
    public String TesstHello(Map map) {
        User u1= new User("1","一");
        User u2 = new User("2","二");
        User u3 = new User("3","三");
        User u4 = new User("4","四");
        User u5 = new User("5","五");
        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        System.out.println(users.toString());
        System.out.println("测试springmvc");
        return HELLO;
    }
}