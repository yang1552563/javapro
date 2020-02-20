package com.neuedu.test6.service;

import com.neuedu.test6.dao.IstudentDao;
import com.neuedu.test6.dao.StudentDao;
import com.neuedu.test6.pojo.Student;

import java.util.List;

/**
 * @author bin
 * @date 2020/2/20 0020 23:16
 */
public class StudentService implements IstudentService {
    IstudentDao studentDao = new StudentDao();
    @Override
    public List<Student> query() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int del(int id) {
        return studentDao.del(id);
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
