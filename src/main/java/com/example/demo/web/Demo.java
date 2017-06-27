package com.example.demo.web;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

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

    @RequestMapping(value = "/cc/{id}")
    public @ResponseBody
    User Demo(@PathVariable("id") Integer id) {

        return userService.getById(id);
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

    @RequestMapping(value = "/insert")
    public @ResponseBody
    void insert(@Valid User user, BindingResult bindingResult) throws Exception{
        userService.insert(user);
    }
}
