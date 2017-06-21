package com.example.demo.web;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Lance on 2017/6/20.
 */
@Controller
@RequestMapping(value = "/hello")
public class Demo {

    @Autowired
    private UserService userService;

    @RequestMapping
    public @ResponseBody String Demo() {
        return "Hello World";
    }
}
