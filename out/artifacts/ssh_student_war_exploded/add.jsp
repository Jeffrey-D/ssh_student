<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>用户注册</title>
</head>
<body style="position: absolute;left: 50%;top: 50%;margin-left: -100px;margin-top: -100px">
	<h2>用户注册</h2>
	<s:form action="add">
		<s:textfield label="手机号" name="userid"/>
		<s:textfield label="用户名" name="username"/>
		<s:password label="密码" name="password"/>
		<s:password label="确认密码" name="passwdck"/>
		<s:submit value="提交"/>
		<s:reset value="重置"/>
	</s:form>	
</body>
</html>