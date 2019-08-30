package com.lxm.service;

import com.lxm.bean.Student;
import com.lxm.dao.StudentDao;
import com.lxm.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao dao;

    public List<Student> getAllStudent() {
        return this.dao.findAll();
    }
}
