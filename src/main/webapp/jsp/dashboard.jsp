<%@ page import="model.User" %>

<%
User user = (User) session.getAttribute("user");

if(user == null){
    response.sendRedirect(request.getContextPath() + "/jsp/login.jsp");
}
%>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<h2>Welcome <%= user.getFullName() %> !!!!!!</h2>

<a href="<%= request.getContextPath() %>/logout">Logout</a>

</body>
</html>