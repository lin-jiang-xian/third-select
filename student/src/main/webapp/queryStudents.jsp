<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询所有学生</title>
    <script type="text/javascript" src="webjars/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#btn").click(function(){
                $.ajax({
                    url:"query.do",
                    dataType:"json",
                    success:function (resp) {
                        $("#body").html("");
                        $.each(resp,function (i,n) {
                            $("#body").append("<tr>");
                            $("#body").append("<td>"+n.id+"</td>");
                            $("#body").append("<td>"+n.name+"</td>");
                            $("#body").append("<td>"+n.age+"</td>");
                            $("#body").append("</tr>");
                        })
                    }
                });
            });
            $("#btn").click();
        })
    </script>
</head>
<body>
    <div align="center">
        <table>
            <thead>
                <tr>
                    <td>id</td>
                    <td>姓名</td>
                    <td>年龄</td>
                </tr>
            </thead>
            <tbody id="body">

            </tbody>
        </table>
        <input type="button" id="btn" value="查询"/>
    </div>
</body>
</html>
