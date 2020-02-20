package com.neuedu.test6.dao;


import com.neuedu.test6.pojo.Student;

import java.util.List;

/**
 * @author bin
 * @date 2020/2/20 0020 23:11
 */
    public interface IstudentDao {
        List<Student> query();
        int add(Student student);
        int update(Student student);
        int del(int id);
        Student queryOne(int id);
    }


