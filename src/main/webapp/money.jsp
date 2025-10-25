<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="${pageContext.request.contextPath}/convert" method="post">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
    <%
        if (request.getAttribute("vnd") != null){
    %>
    <h3>ket qua</h3>
    <p>Rate:<%=request.getAttribute("rate")%></p>
    <p>USD: <%= request.getAttribute("usd") %></p>
    <p>VND: <%= request.getAttribute("vnd") %></p>
    <%
        }
    %>
</form>
</body>
</html>
