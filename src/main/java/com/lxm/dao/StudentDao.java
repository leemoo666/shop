package com.lxm.dao;

import com.lxm.bean.Student;
import com.lxm.mapper.StudentMapper;
import com.lxm.tools.DBTools;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    private StudentMapper mapper;

    public List<Student> findAll() {
         return mapper.findAll();
    }
}
