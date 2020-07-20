package com.guigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhanglaoshi
 * @date 2020/7/14 8:16
 */
@Controller
public class TestForwordAndRedirect {

    @RequestMapping(value = "/forword")
    public String Test01() {
        System.out.println("123");
        return "hello";
    }


    @RequestMapping(value = "/testFile", method = RequestMethod.POST)
    public String TestFile(@RequestParam("file") MultipartFile file) {
        System.out.println("123");
        System.out.println(file);
        String originalFilename = file.getOriginalFilename();
        System.out.println(originalFilename);
        return "hello";
    }

    @RequestMapping(value = "/testFiles" , method = RequestMethod.POST)
    public String TestFiles(@RequestParam("file") MultipartFile file) {

        return "";
    }


}
