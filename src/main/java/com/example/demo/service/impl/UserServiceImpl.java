package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Lance on 2017/6/20.
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    @Transactional
    public void insert(User user) {
        user.setName("test");
        user.setUserName("123");
        user.setPassword("123456");
        userDao.insert(user);

        User user1 = new User();
        user1.setName("test");
        user1.setPassword("123456");
        userDao.insert(user1);
    }
}
