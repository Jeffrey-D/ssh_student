<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
</head>
<body style="position: absolute;left: 50%;top: 50%;margin-left: -100px;margin-top: -100px">
    <form action="admin.action">
        <s:textfield label="管理员账户" name="adminname"/><br>
        <s:password label="管理员密码" name="adminpassword"/><br>
        <s:submit value="登陆"/>
    </form>
</body>
</html>
