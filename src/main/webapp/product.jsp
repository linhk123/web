<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h1>Ứng dụng Product Discount Calculator</h1>
<p>Mô tả: Ứng dụng Product Discount Calculator được sử dụng để tính chiết khấu cho sản phẩm khi mua hàng online.</p>

<form action="${pageContext.request.contextPath}/display-discount" method="post">
    <label>Mô tả sản phẩm:</label><br>
    <input type="text" name="product" placeholder="Mô tả sản phẩm" required><br><br>

    <label>Giá niêm yết:</label><br>
    <input type="number" name="price" placeholder="Giá niêm yết" required><br><br>

    <label>Tỷ lệ chiết khấu (%):</label><br>
    <input type="number" name="percent" placeholder="Phần trăm chiết khấu" required><br><br>

    <button type="submit">Calculate Discount</button>
</form>
</body>
</html>
