<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/23/2022
  Time: 6:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Validate</h1>
<h3 style="color: red">${message}</h3>
<form action="validate"method="post" >
    <input type="text" name="email">
    <input type="submit" value="Validate">

</form>



</body>
</html>
