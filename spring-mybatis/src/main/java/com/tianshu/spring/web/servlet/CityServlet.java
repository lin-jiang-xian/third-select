package com.tianshu.spring.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tianshu.spring.web.domain.City;
import com.tianshu.spring.web.service.CityService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        ServletContext servletContext = getServletContext();
        WebApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        request.setCharacterEncoding("UTF8");
        String str_pid = request.getParameter("pid");
        int pid = Integer.parseInt(str_pid);
//        String config = "applicationContext.xml";
//        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        CityService service = (CityService) ac.getBean("cityService");
        List<City> cities = service.queryCityByPid(pid);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(cities);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().println(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        doPost(request,response);
    }
}
