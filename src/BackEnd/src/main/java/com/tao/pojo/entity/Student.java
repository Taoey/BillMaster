package com.tao.pojo.entity;

import lombok.Data;

import java.util.Date;


@Data
public class Student {
    private String name;
    private Integer age;
    private Date date;

    public Student(String name, Integer age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }
}
