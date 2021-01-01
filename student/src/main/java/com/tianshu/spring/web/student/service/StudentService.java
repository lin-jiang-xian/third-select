package com.tianshu.spring.web.student.service;

import com.tianshu.spring.web.student.beans.Student;

import java.util.List;

public interface StudentService {
    int addStudent(String name, Integer age);
    List<Student> queryStudents();
}
