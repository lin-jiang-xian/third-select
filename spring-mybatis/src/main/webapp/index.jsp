<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>中国省市级联查询</title>
    <script type="text/javascript" src="webjars/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $.ajax({
                url:"provinceServlet",
                dataType:"json",
                success:function (response) {
                    $("#province").html("<option value='0' selected>==请选择==</option>");
                    $.each(response, function (index, province) {
                        $("#province").append("<option value="+province.id+">"+province.name+"</option>");
                    })
                }
            });
            $("#province").on("change",function () {
                $.ajax({
                    url: "cityServlet",
                    data:{
                        pid:$("#province").val()
                    },
                    dataType: "json",
                    success:function (response) {
                        $("#city").html("<option value='0' selected>==请选择==</option>");
                        $.each(response,function (index, city) {
                            $("#city").append("<option value="+city.id+">"+city.name+"</option>");
                        })
                    }
                })
            });
        })
    </script>
</head>
<body>
    <select id="province">
        <option value="0" selected>==请选择==</option>
    </select>省<br>
    <select id="city">
        <option value="0" selected>==请选择==</option>
    </select>市<br>

    <form action="some.do" method="post">
        姓名:<input type="text" name="name"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
