<%@ page import="org.apache.struts2.ServletActionContext" %>
<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>������Ϣ</title>
</head>
<body style="position: absolute;left: 50%;top: 50%;margin-left: -100px;margin-top: -100px">
	<h2 style="text-align: center">������Ϣ</h2>
	<s:form action="update">
		�ֻ��ţ�<s:property value="#session.usercode"/>
		<s:textfield label="�û���" name="username"/>
		<s:textfield label="�û�����" name="password"/>
		<s:submit value="����"/>
		<s:reset value="����"/>
	</s:form>	
	
</body>
</html>