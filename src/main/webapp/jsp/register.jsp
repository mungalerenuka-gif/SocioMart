<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SocioMart Registration</title>
</head>
<body>

<h2>Register for SocioMart</h2>

<form action="../register" method="post">

    Full Name:
    <input type="text" name="fullName"><br><br>

    Email:
    <input type="email" name="email"><br><br>

    Password:
    <input type="password" name="password"><br><br>

    Phone:
    <input type="text" name="phone"><br><br>

    Society Name:
    <input type="text" name="societyName"><br><br>

    Society Token:
    <input type="text" name="societyToken"><br><br>

    Address:
    <input type="text" name="address"><br><br>

    Role:
    <select name="role">
        <option value="Buyer">Buyer</option>
        <option value="Seller">Seller</option>
        <option value="Donor">Donor</option>
    </select><br><br>

    <input type="submit" value="Register">

</form>

</body>
</html>