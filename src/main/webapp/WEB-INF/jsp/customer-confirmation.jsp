<%--
  Created by IntelliJ IDEA.
  User: jacob
  Date: 25. 10. 2020
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Confirmed</title>
</head>
<body>
    <p>Customer Confirmed: ${customer.firstName} ${customer.lastName}</p>
    <p>Customer's Free passes: ${customer.freePasses}</p>
    <p>Customer's Postal Code: ${customer.postalCode}</p>
    <p>Customer's Course Code: ${customer.courseCode}</p>
</body>
</html>
