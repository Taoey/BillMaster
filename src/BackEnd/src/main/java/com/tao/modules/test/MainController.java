package com.tao.modules.test;


import com.tao.pojo.entity.Student;
import com.tao.pojo.sys.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("test")
class MainController {
    @RequestMapping("/index")
    public String index(){
        return "hello";
    }

    @GetMapping("/student_list")
    public Message getStudentInfo(){
        List<Student> stus = new ArrayList<>();
        stus.add(new Student("tao",12,new Date()));
        stus.add(new Student("黄为涛",20,new Date()));
        stus.add(new Student("黄为涛",20,new Date()));
        return new Message(Message.STATUS_OK).setResult(stus);
    }

    @GetMapping(value = "/zero")
    public String zeroException(){
        return (1/0)+"";
    }

    @GetMapping("/filter_exception")
    public Message filterException(){
        System.out.println("进入了过滤器测试程序");
        return null;
    }

}
