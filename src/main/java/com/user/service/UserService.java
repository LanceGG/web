package com.user.service;

import com.user.domain.User;

/**
 * Created by Lance on 2017/6/15.
 */
public interface UserService {

    public void add(User user);

    public void edit(User user);

    public void delete(Integer id);

    public User findById(Integer id);
}
