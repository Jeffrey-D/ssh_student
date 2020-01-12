<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>用户信息列表</title>
</head>
<body>
	<h2>用户信息列表</h2>
	<table border="1">
		
		<tr>
			<td>用户手机号</td>
			<td>用户名</td>
			<td>账户密码</td>
			<td>是否删除</td>
		</tr>
		<%--	与showaction中的getRequest().setAttribute()对应	--%>
		<s:iterator value="#request.all" id="user">
		<tr>
			<td><s:property value="#user.userid"/></td>
			<td><s:property value="#user.username"/></td>
			<td><s:property value="#user.password"/></td>
			<td><a href="delete.action?userid=<s:property value='#user.userid'/>">删除</a></td>
		</tr>
		</s:iterator>	
	</table>
</body>
</html>