package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Lance on 2017/6/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @Test
    public void getByIdTest() {
        User user = userService.getById(8);
        Assert.assertEquals(new Integer(13),user.getName());
    }
}
