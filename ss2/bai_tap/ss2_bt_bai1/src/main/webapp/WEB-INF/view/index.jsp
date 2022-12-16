<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
    <input type="checkbox" name="condiment" value="lettuce">
    <label>Lettuce</label>
    <input type="checkbox" name="condiment" value="tomoto">
    <label>Tamoto</label>
    <input type="checkbox" name="condiment" value="mustard">
    <label>Mustard</label>
    <input type="checkbox" name="condiment" value="sprouts">
    <label>Sprouts</label>
    <hr>
    <button type="submit">save</button>
</form>
<h3>${result}</h3>
</body>
</html>