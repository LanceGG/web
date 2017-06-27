package com.example.demo.exception;

/**
 * Created by Lance on 2017/6/27.
 */
public class BasicException extends RuntimeException {

    private Integer code;

    public BasicException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
