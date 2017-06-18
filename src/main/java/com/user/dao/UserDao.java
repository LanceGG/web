package com.user.dao;

import com.user.domain.User;
import com.user.domain.util.Status;
import org.springframework.data.repository.query.Param;

/**
 * Created by Lance on 2017/4/18.
 */
public interface UserDao {

    void add(User user);

    void edit(User user);

    void delete(@Param("id") Integer id, @Param("status")Status status);

    User findById(@Param("id") Integer id);
}
