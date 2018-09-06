<%@ page import="java.util.List" %>
<%@ page import="cn.kgc.ssm.model.Book" %><%--
  Created by IntelliJ IDEA.
  User: sam
  Date: 2018/9/4
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>查询所有图书</title>
    <link type="text/css" rel="stylesheet" href="../../css/queryAllBook.css">
</head>
<body>
<div id="mainBox">
    <div><h1>图书列表</h1>
        <br/>
        <form id="searchForm" name="searchForm" method="get" action="queryBook">
            <div>
                <input type="submit" value="查询">
                <select id="queryType"  name="queryType">
                    <option  value="book_Name">书名</option>
                    <option value="book_Author">作者</option>
                    <option value="book_Pulish">出版社</option>
                </select>
                <input type="text" name="queryText" >
            </div>
        </form>
    </div>
    <div>
        <a style="margin-right: 0px" href="http://localhost:8080/book/preAddBook">增加新书</a>

        <jsp:include page="queryResult.jsp">
            <jsp:param name="bookList" value="${bookList}" />
        </jsp:include>

      <%-- <table>
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
        --%>
    <%--  <c:forEach items="${bookList}" var="book">
        书名: ${book.bookName}
        作者:${book.bookAuthor}
        创建时间: <fmt:formatDate value="${book.createTime}"
                              pattern="yyyy-MM-dd HH:mm:ss"/> <br>
         </c:forEach>--%>

    </div>
</div>




</body>
</html>
