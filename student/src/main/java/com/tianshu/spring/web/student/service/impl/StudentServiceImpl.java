package com.tianshu.spring.web.student.service.impl;

import com.tianshu.spring.web.student.beans.Student;
import com.tianshu.spring.web.student.dao.StudentDao;
import com.tianshu.spring.web.student.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource(name = "studentDao")
    private StudentDao studentDao;

    @Override
    public int addStudent(String name,Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> queryStudents() {
        return studentDao.selectStudents();
    }
}
