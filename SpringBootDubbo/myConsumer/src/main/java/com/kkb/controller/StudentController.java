package com.kkb.controller;

import com.kkb.pojo.Student;
import com.kkb.service.StudentService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Reference
    private StudentService studentService;

    @RequestMapping("students")
    @ResponseBody
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

}
