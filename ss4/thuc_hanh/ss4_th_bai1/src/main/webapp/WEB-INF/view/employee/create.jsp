<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/26/2022
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create a new Employee</title>
</head>
<body>
<h3>Wecome, Enter the Employee Details</h3>
<form:form modelAttribute="employee" method="post" action="addEmployee">
  <table>
    <tr>
      <td><form:label path="id" />Employee ID:     </td>
      <td><form:input path="id" />  </td>
    </tr>
    <tr>
      <td><form:label path="name"/>Employee's name:</td>
      <td><form:input path="name"/></td>
    </tr>
    <tr>
      <td><form:label path="contactNumber"/>Contact's number: </td>
      <td><form:input path="contactNumber"/> </td>
    </tr>
    <tr>
      <td><input type="submit" value="Submit"></td>
    </tr>

  </table>

</form:form>


</body>
</html>
