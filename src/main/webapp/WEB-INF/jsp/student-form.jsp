<%--
  Created by IntelliJ IDEA.
  User: jacob
  Date: 25. 10. 2020
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name:
        <form:input path="firstName"/>

        <br><br>

        Last name:
        <form:input path="lastName"/>

        <br><br>
        Country:

        <form:select path="country">
            <form:options items="${student.countryOptions}"/>
        </form:select>

        <br><br>

        Fav Language:

        Java <form:radiobutton path="favoriteLanguage" value="Java"/>
        C# <form:radiobutton path="favoriteLanguage" value="Java"/>
        Python <form:radiobutton path="favoriteLanguage" value="Java"/>
        C++ <form:radiobutton path="favoriteLanguage" value="Java"/>

        <br><br>
        Linux: <form:checkbox path="operatingSystems" value="Linux"/>
        MacOS X: <form:checkbox path="operatingSystems" value="MacOSX"/>
        Microsoft Windows: <form:checkbox path="operatingSystems" value="MS Windows"/>
        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
