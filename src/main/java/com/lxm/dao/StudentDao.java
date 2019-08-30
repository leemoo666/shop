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
public class StudentDao implements StudentMapper {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    public List<Student> findAll() {
//
        StudentMapper mapper = sqlSessionTemplate.getMapper(StudentMapper.class);
        return mapper.findAll();
    }

//    public List<Student> findAll() {
//        SqlSession session = DBTools.getSession();
//        StudentMapper mapper = (StudentMapper) session.getMapper(StudentMapper.class);
//        List<Student> all = new ArrayList();
//        try {
//            all = mapper.findAll();
//            session.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            session.rollback();
//        }
//        return all;
//    }
}
