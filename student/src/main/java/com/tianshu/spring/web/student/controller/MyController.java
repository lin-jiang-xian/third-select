package com.tianshu.spring.web.student.controller;

import com.tianshu.spring.web.student.beans.Student;
import com.tianshu.spring.web.student.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class MyController {

    @Resource(name = "studentService")
    private StudentService studentService;

    @RequestMapping(value = "/add.do")
    public String add(String name,Integer age){
        int num = studentService.addStudent(name, age);
        if(num > 0){
            return "success";
        }else {
            return "failure";
        }
    }

    @RequestMapping(value = "/query.do")
    @ResponseBody
    public Object query(){
        return studentService.queryStudents();
    }

}
