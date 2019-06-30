package com.tao.modules.student;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.tao.data.generator.dao.StudentMapper;
import com.tao.data.generator.pojo.Student;
import com.tao.data.generator.pojo.StudentExample;
import com.tao.pojo.sys.GridPage;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;


    public JSONObject list(SimpleMap map){
        GridPage result = new GridPage();
        StudentExample example = new StudentExample();

        PageHelper.startPage(map.getPageNum(),map.getPageSize());
        List<Student> rows = studentMapper.selectByExample(example);
        long total = studentMapper.countByExample(example);

        result.setRows(rows);
        result.setTotal(total);


        return result.toJSON();
    }

    public void save(SimpleMap map){
        Student student = (Student) map.toBean(Student.class);
        studentMapper.insertSelective(student);
    }
}
