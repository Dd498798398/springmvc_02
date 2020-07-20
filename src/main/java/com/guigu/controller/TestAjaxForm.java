package com.guigu.controller;

import com.guigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhanglaoshi
 * @date 2020/7/13 16:53
 */
@Controller
public class TestAjaxForm {

    @ResponseBody
    @RequestMapping(value = "/testPojo", method = RequestMethod.POST)
    public String testPojo(@RequestBody User user) {
        System.out.println(user.toString());
        return user.toString();
    }

    @RequestMapping(value = "/testAjax")
    public String Test(User user) {
        System.out.println(user.toString());
        return "hello";
    }

}
