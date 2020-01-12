<%@ page import="org.apache.struts2.ServletActionContext" %>
<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>更新信息</title>
</head>
<body style="position: absolute;left: 50%;top: 50%;margin-left: -100px;margin-top: -100px">
	<h2 style="text-align: center">更新信息</h2>
	<s:form action="update">
		手机号：<s:property value="#session.usercode"/>
		<s:textfield label="用户名" name="username"/>
		<s:textfield label="用户密码" name="password"/>
		<s:submit value="更新"/>
		<s:reset value="重置"/>
	</s:form>	
	
</body>
</html>