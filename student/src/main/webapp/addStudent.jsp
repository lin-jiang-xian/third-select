<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
    <div align="center">
        <form action="${pageContext.request.contextPath}/add.do" method="post">
            姓名:<input type="text" name="name"/><br>
            年龄:<input type="text" name="age"/><br>
            <input type="submit" value="添加">
        </form>
    </div>
</body>
</html>
