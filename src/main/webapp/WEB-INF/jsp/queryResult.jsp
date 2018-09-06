<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018-09-06
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>查询结果</title>
    <link type="text/css" rel="stylesheet" href="../../css/queryAllBook.css">
</head>
<body>
<table>
    <thead>
    <tr>
        <td>编号</td>
        <td>书名</td>
        <td>作者</td>
        <td>出版社</td>
        <td>页数</td>
        <td>价格</td>
        <td>入库时间</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${bookList}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.bookName}</td>
            <td>${book.bookAuthor}</td>
            <td>${book.bookPulish}</td>
            <td>${book.bookPage}</td>
            <td>${book.bookPrice}</td>
            <td><fmt:formatDate value="${book.createTime}"
                                pattern="yyyy-MM-dd HH:mm:ss"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
