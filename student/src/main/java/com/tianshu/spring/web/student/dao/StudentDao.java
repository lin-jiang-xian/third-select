package com.tianshu.spring.web.student.dao;

import com.tianshu.spring.web.student.beans.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student student);
    List<Student> selectStudents();
}
