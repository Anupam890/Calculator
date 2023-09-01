<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mini Calculator</title>
</head>
<body>
<form action="calculate" method="GET">
<label>Number 1:</label>
<input type="number" name="number1" />
<br/>
<label>Number 2:</label>
<input type="number" name="number2" />
<br/>
    <label> Operations:
        <select>
            <option value="add">Add</option>
            <option value="sub">Subtract</option>
            <option value="mul">Multiply</option>
            <option value="div">Divide</option>
        </select>
    </label>
<br/>
<input type="submit" value="Calculate" />


</form>
</body>
</html>