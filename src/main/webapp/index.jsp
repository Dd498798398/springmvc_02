<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
    <title>qwe</title>
    <%--    <script src="/WEB-INF/js/jquery-1.9.1.min.js"></script>--%>
    <script>
        function aa() {
            $.ajax({
                type: "POST",
                url: "/springmvc_02_war_exploded/testAjax",
                data: $("#abc").serialize(),
                dataType: "JSON",
                success: function (data) {
                    alert('success');
                },
                error: function () {
                    alert("请求失败")
                }
            })
        }
    </script>
</head>
<body>
<form id="abc">
    年龄：<input type="text" name="age">
    姓名：<input type="text" name="name">
    <input type="button" value="提交" onclick="aa()">
</form>
<br><br><br><br>
<form action="/springmvc_02_war_exploded/testFile" , enctype="multipart/form-data" ,method="post">
    文件上传：<input type="file" name="file">
    <input type="submit" value="submit">
</form>

</body>
</html>