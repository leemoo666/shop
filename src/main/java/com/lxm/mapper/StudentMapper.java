package com.lxm.mapper;

import com.lxm.bean.Student;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface StudentMapper {
    List<Student> findAll();
}
