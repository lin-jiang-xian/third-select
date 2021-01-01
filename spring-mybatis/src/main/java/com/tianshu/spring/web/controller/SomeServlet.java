package com.tianshu.spring.web.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class SomeServlet {

    @RequestMapping(value = "/some.do",method = RequestMethod.POST)
    public ModelAndView doSome(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        System.out.println(name);
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age","22");

        mv.setViewName("first");
        resp.getWriter().write("这是新加的");
        return mv;
    }
}
