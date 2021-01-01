<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理页面</title>
</head>
<body>
    <div align="center">
        <h3>学生管理</h3><br>
        <a href="${pageContext.request.contextPath}/addStudent.jsp">添加学生</a><br>
        <a href="${pageContext.request.contextPath}/queryStudents.jsp">查询所有学生</a><br>
    </div>

    <a href="abc.do">abc.do请求转发</a>
    <a href="def.do">def.do重定向</a>

</body>
</html>
