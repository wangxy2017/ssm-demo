<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    用户名：<input name="username" type="text"><br>
    密码：<input name="password" type="text"><br>
    <button type="button">登录</button>
</form>
<script src="/resources/js/jquery-2.1.4.min.js"></script>
<script>
    $(function () {
        $("button").on("click", function () {
            $.post("/login", $("form").serialize(), function (result) {
                if (result.code == 0) {
                    window.location.href = "/";
                } else {
                    alert(result.message);
                }
            }, "json");
        });
    });
</script>
</body>
</html>
