<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>中国省市级联查</title>
    <script type="text/javascript" src="webjars/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#country").change(function(){
                if($("#country").val() == 0){
                    $("#province").html("<option value='0' selected>==请选择==</option>");
                    $("#prefecture").html("<option value='0' selected>==请选择==</option>");
                    $("#county").html("<option value='0' selected>==请选择==</option>");
                }else{
                    $.ajax({
                        url:"${pageContext.request.contextPath}/province.do",
                        data:{
                            pid:$("#country").val()
                        },
                        dataType:"json",
                        success:function (resp) {
                            $("#province").html("<option value='0' selected>==请选择==</option>");
                            $.each(resp,function (i,n) {
                                $("#province").append("<option value='"+n.id+"'>"+n.name+"</option>")
                            });
                        }
                    });
                    $("#prefecture").html("<option value='0' selected>==请选择==</option>");
                    $("#county").html("<option value='0' selected>==请选择==</option>");
                }
            })

            $("#province").change(function(){
                if($("#province").val() == 0){
                    $("#prefecture").html("<option value='0' selected>==请选择==</option>");
                    $("#county").html("<option value='0' selected>==请选择==</option>");
                }else{
                    $.ajax({
                        url:"${pageContext.request.contextPath}/prefecture.do",
                        data:{
                            pid:$("#province").val()
                        },
                        dataType:"json",
                        success:function (resp) {
                            $("#prefecture").html("<option value='0' selected>==请选择==</option>");
                            $.each(resp,function (i,n) {
                                $("#prefecture").append("<option value='"+n.id+"'>"+n.name+"</option>")
                            });
                        }
                    });
                    $("#county").html("<option value='0' selected>==请选择==</option>");
                }
            })

            $("#prefecture").change(function(){
                if($("#country").val() == 0){
                    $("#county").html("<option value='0' selected>==请选择==</option>");
                }else{
                    $.ajax({
                        url:"${pageContext.request.contextPath}/county.do",
                        data:{
                            pid:$("#prefecture").val()
                        },
                        dataType:"json",
                        success:function (resp) {
                            $("#county").html("<option value='0' selected>==请选择==</option>");
                            $.each(resp,function (i,n) {
                                $("#county").append("<option value='"+n.id+"'>"+n.name+"</option>")
                            });
                        }
                    })
                }
            })

        })
    </script>
</head>
<body>
    <div align="center">
        <table>
            <tr id="tr1">
                <td>
                    <select id="country">
                        <option value="0" selected>==请选择==</option>
                        <option value="1">中国</option>
                    </select>
                </td>
                <td>
                    <select id="province">
                        <option value="0" selected>==请选择==</option>
                    </select>省
                </td>
                <td>
                    <select id="prefecture">
                        <option value="0" selected>==请选择==</option>
                    </select>市
                </td>
                <td>
                    <select id="county">
                        <option value="0" selected>==请选择==</option>
                    </select>县
                </td>
            </tr>
        </table>
    </div>
</body>
</html>
