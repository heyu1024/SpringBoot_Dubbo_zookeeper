package com.kkb.service.impl;

import com.kkb.pojo.Student;
import com.kkb.service.StudentService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    public List<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("tom","110"));
        students.add(new Student("jerry","119"));
        students.add(new Student("jack","120"));
        return students;
    }
}
