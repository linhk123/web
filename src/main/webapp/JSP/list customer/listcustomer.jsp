<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách khách hàng</title>
    <!-- Thêm Bootstrap để có style đẹp -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="text-center mb-4">Danh sách khách hàng</h2>
    <table class="table table-bordered table-hover shadow">
        <thead class="table-dark text-center">
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${customers}">
            <tr>
                <td>${customer.name}</td>
                <td>${customer.birth}</td>
                <td>${customer.address}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
