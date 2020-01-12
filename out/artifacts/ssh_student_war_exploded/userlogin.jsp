<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
</head>
<body style="position: absolute;left: 50%;top: 50%;margin-left: -100px;margin-top: -100px">
<h1>登陆</h1>
    <s:form action="userlogin">
        <s:textfield label="用户手机号" name="usercode"/>
        <s:password label="用户密码" name="userpasswd"/>
        <s:submit value="登陆"/>
    </s:form>
</body>
</html>
