<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/25/2022
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/realizable" method="post">
    <input type="text" size="35" name="number1">
    <input type="text" size="35" name="number2">
    <br>
    <input type="submit" name="calculator" value="+">
    <input type="submit" name="calculator" value="-">
    <input type="submit" name="calculator" value="*">
    <input type="submit" name="calculator" value="/">

</form>
<h3>${result}</h3>
</body>
</html>
