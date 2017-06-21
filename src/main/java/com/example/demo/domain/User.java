package com.example.demo.domain;

import java.io.Serializable;

/**
 * Created by Lance on 2017/6/20.
 */
public class User implements Serializable{

    private static final long serialVersionUID = -48061577457645829L;

    private Integer id;

    private String name;

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
}
