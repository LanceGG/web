package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.exception.BasicException;
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
    public void insert(User user) throws Exception{
        if (user.getAge()<10) {
            throw new BasicException(100,"测试");
        }

        userDao.insert(user);
    }
}
