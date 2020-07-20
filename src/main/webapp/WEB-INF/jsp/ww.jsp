<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script>
        function form_submit() {
            document.getElementById('abc').action
            document.getElementById('abc').action = "/lawyer/api";
            document.getElementById('abc').submit();
        }
    </script>
</head>
<body>
<form id="abc" method="post">
    年龄：<input type="text" name="age">
    姓名：<input type="text" name="name">
    <input id="dian" type="button" value="提交" onclick="form_submit()">
</form>

</body>
</html>