package com.example.demo.domain;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * Created by Lance on 2017/6/20.
 */
public class User implements Serializable{

    private static final long serialVersionUID = -48061577457645829L;

    private Integer id;

    private String name;

    private String userName;

    private String password;

    @Min(value = 18,message = "未成年")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
