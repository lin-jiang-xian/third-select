package com.tianshu.spring.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tianshu.spring.web.domain.Province;
import com.tianshu.spring.web.service.ProvinceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProvinceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf8");
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        ProvinceService service = (ProvinceService) ac.getBean("provinceService");
        List<Province> provinces = service.queryAllProvince();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(provinces);
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }
}
