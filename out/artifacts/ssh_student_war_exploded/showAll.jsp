<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>�û���Ϣ�б�</title>
</head>
<body>
	<h2>�û���Ϣ�б�</h2>
	<table border="1">
		
		<tr>
			<td>�û��ֻ���</td>
			<td>�û���</td>
			<td>�˻�����</td>
			<td>�Ƿ�ɾ��</td>
		</tr>
		<%--	��showaction�е�getRequest().setAttribute()��Ӧ	--%>
		<s:iterator value="#request.all" id="user">
		<tr>
			<td><s:property value="#user.userid"/></td>
			<td><s:property value="#user.username"/></td>
			<td><s:property value="#user.password"/></td>
			<td><a href="delete.action?userid=<s:property value='#user.userid'/>">ɾ��</a></td>
		</tr>
		</s:iterator>	
	</table>
</body>
</html>