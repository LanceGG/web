package com.example.demo.handle;

import com.example.demo.domain.Result;
import com.example.demo.exception.BasicException;
import com.example.demo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Lance on 2017/6/27.
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof BasicException) {
            BasicException basicException = (BasicException) e;
            return ResultUtil.error(basicException.getCode(), basicException.getMessage());
        } else {
            logger.error("[系统异常] {}",e);
            return ResultUtil.error(-1, e.getMessage());
        }
    }
}
