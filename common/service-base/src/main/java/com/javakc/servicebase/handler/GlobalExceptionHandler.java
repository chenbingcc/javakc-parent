package com.javakc.servicebase.handler;

import com.javakc.commonutils.api.APICODE;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Mr.Chen
 * @discription
 * @date 2020/11/23 19:30
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    /*当我们使用这个@ExceptionHandler注解时，我们需要定义一个异常的处理方法，
    给这个方法加上@ExceptionHandler注解，
    这个方法就会处理类中其他方法（被@RequestMapping注解）抛出的异常。*/
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public APICODE errorHandler(Exception e) {
        e.printStackTrace();//打印出异常
        return APICODE.ERROR().message("Exception:服务器异常!");
    }

    @ExceptionHandler(HctfException.class)
    @ResponseBody
    public APICODE errorHandler(HctfException e) {
        e.printStackTrace();
        return APICODE.ERROR().message(e.getMsg()).code(e.getCode());
    }
}
