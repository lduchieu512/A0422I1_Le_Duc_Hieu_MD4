<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/23/2022
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h2>Vietnamese Dictionary</h2>
    <form method="post">
        <input type="text" name="word" placeholder="Enter English Word: ">
        <input type="submit" id="submit" value="Search">
    </form>
    <div>
        <c:out value="${result}"></c:out>
    </div>
</center>
</body>
</html>
