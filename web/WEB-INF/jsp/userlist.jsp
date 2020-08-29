<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 张鸿飞
  Date: 2020/8/29
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table cellpadding="0" cellspacing="0">
    <tr>
        <td>名称：</td>
        <td>时间：</td>
        <td>天数：</td>
    </tr>
    <jsp:useBean id="users" scope="request" type="java.util.List"/>
    <jsp:useBean id="user" class="com.morea.model.User"/>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.pwd}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
