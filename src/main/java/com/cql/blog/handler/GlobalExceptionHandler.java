package com.cql.blog.handler;

import com.cql.blog.dto.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO
 *
 * @author 陈琪亮
 * @version 1.0
 * @date 2020/8/7 18:21
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.error().message("出現了異常!");
    }

    @ExceptionHandler(BlogException.class)
    @ResponseBody
    public R error(BlogException e){
        e.printStackTrace();
        return R.error().message(e.getMessage()).code(e.getCode());
    }
}
