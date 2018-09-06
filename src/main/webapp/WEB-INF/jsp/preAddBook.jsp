<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018-09-05
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>添加新书</title>
    <link type="text/css" rel="stylesheet" href="../../css/addBook.css">
</head>
<body>

    <div id="mainBox">
        <form method="get" name="addForm" action="addBook">
            <div id="showBox" >
                <p>增加新书</p>
                <p>书名：<input name="book_Name" type="text">*</p>
                <p>作者：<input name="book_Author" type="text">*</p>
                <p>出版社：<input name="book_Pulish" type="text">*</p>
                <p>页数：<input name="book_Page" type="text">*</p>
                <p>价格：<input name="book_Price" type="text">*</p>
                <p><input type="submit" value="提交"><input type="reset" value="重置"></p>
            </div>
        </form>
         </div>
</body>
</html>
