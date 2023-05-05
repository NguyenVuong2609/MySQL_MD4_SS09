<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>ProductDiscountCalculator</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form method="post" action="pd-calculator">
    <label>Product Description: </label><br/>
    <input type="text" name="description" placeholder="Description" value=""/><br/>
    <label>List Price: </label><br/>
    <input type="text" name="price" placeholder="Price" value="0"/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="discount" placeholder="Discount Percent" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Calculator"/>
</form>
</body>
</html>