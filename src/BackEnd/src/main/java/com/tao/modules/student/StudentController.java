package com.tao.modules.student;

import com.alibaba.fastjson.JSONObject;
import com.tao.pojo.sys.Message;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("insert_test")
    public Message insertTest(){
        SimpleMap map = new SimpleMap();
        map.put("name","黄为涛");
        studentService.save(map);
        return new Message(Message.STATUS_OK);
    }
}
