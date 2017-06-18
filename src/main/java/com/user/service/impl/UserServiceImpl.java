package com.user.service.impl;

import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.dao.UserDao;
import com.user.domain.User;
import com.user.domain.util.Status;

/**
 * Created by Lance on 2017/6/15.
 */
@Service()
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void edit(User user) {
        userDao.edit(user);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id, Status.LRMD);
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

}
