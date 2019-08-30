package com.lxm.controller;

import com.lxm.bean.Student;
import com.lxm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping({"student"})
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = {"getAllStudent"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public List<Student> getAllStudents(String name) {
        System.out.print(name);
        return this.studentService.getAllStudent();
    }
}
