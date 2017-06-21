package com.example.demo.web;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/cc")
    public @ResponseBody
    User Demo() {
        return userService.getById(1);
    }

    @RequestMapping(value = "/dd")
    public @ResponseBody
    User Demo3() {
        return userDao.getById(1);
    }

    @RequestMapping(value = "/hh")
    public @ResponseBody
    String Demo2() {
        return "Hello World";
    }
}