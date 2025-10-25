<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 25/10/2025
  Time: 2:56 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    class Customer {
        String name;
        String birth;
        String address;

    public Customer (String name , String birth , String address){
        this.name =name;
        this.birth = birth;
        this.address=address;
    }
    public String getName() { return name; }
    public String getBirthday() { return birth; }
    public String getAddress() { return address; }

    }

    java.util.List<Customer> customers = new java.util.ArrayList<>();
    customers.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội"));
    customers.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang"));
    customers.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định"));
    customers.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây"));
    customers.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội"));

    request.setAttribute("customers",customers);
    %>
<jsp:forward page="listcustomer.jsp"/>
</body>

</html>
