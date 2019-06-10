package com.tao.config;

import com.tao.pojo.sys.Message;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class MyExceptionHandler {

    //如果不配置@ResponseBody，仍然是返回某个页面
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Message exceptionHandler(HttpServletRequest request , Exception e){
        e.printStackTrace();
        String message = "服务器异常";
        return new Message(Message.SERVER_ERROR).setResult(message);
    }

    @ResponseBody
    @ExceptionHandler(ServletException.class)
    public Message servletexceptionHandler(HttpServletRequest request , Exception e){
        e.printStackTrace();
        String message = "Filter抛出了异常";
        return new Message(Message.SERVER_ERROR).setResult(message);
    }

}
