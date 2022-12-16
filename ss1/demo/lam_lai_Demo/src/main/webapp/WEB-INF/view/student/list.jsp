<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/21/2022
  Time: 6:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>List student</title>
  </head>
  <body>
 <table border="1">
   <tr>
       <th>ID</th>
       <th>Name</th>
       <th>Age</th>
       <th>Address</th>
   </tr>
     <c:forEach items="${student}" var="student">
        <tr>
            <td>${student.id} </td>
            <td>${student.name} </td>
            <td>${student.age} </td>
            <td>${student.address} </td>
        </tr>

     </c:forEach>
 </table>

  </body>
</html>
