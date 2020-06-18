package com.rory.controller;

import com.rory.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/hello", method = {RequestMethod.GET,RequestMethod.POST})
    public String hello () {

        System.out.println("表示层");
        userService.findAll();
        return "success";
    }
}
