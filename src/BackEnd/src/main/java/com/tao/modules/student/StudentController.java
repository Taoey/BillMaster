package com.tao.modules.student;

import com.alibaba.fastjson.JSONObject;
import com.tao.pojo.sys.Message;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/list")
    public Message list(@RequestBody SimpleMap params){
        System.out.println(params);
        JSONObject result = studentService.list(params);
        return new Message(Message.STATUS_OK).setResult(result);
    }
}
