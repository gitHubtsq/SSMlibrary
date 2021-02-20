package com.controller;/**
 * ClassName:    TestController
 * Datetime:    2021/2/7   10:04
 * Author:   tangshouoquan
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName :   TestController
 * @Author: tangshouquan
 * @CreateDate: 2021/2/7 10:04
 * @Version: 1.0
 */
@Controller
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping("dologin")
    public String dologin() {
        System.out.println("====test====");
        return "index";
    }

}
