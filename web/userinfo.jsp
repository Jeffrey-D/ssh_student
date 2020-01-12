<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
</head>
<body >
    您的个人信息
    <strong>手机号<s:property value="#session.usercode"/>
    <strong>密码<s:property value="#session.passwd"/>
    <a href="update.jsp">更新密码</a>
<div style="text-align:center ">
    <h2>请输入你想要查找的书名</h2>
    <form action="searchBook.action">
        <s:textfield label="请输入想要查找的书名" name="search_book"/>
        <input  type="submit" value="提交"/>
    </form>
</div>


        <div>
    <%--    查询显示的书单--%>
    <center>
    <table border="1" style="text-align: center;font-size: 25px">

        <tr>
            <td>书编号</td>
            <td>书名</td>
            <td>价格</td>
        </tr>
        <%--	与showaction中的getRequest().setAttribute()对应	--%>
        <s:iterator value="#request.result" id="book">
            <tr>
                <td><s:property value="#book.bookid"/></td>
                <td><font color= <s:if test="%{#book.price > 30}"> yellow</s:if> > <s:property value="#book.name"/> </font></td>
                <td><s:property value="#book.price"/></td>
            </tr>
        </s:iterator>
    </table>
    </center>
</div>
</body>
</html>
