package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Lance on 2017/6/20.
 */
public interface UserDao {

    User getById(@Param("id") Integer id);
}
