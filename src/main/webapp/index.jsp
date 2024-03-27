<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--task lab--%>
<%--1 по 3 та hw 1--%>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>

<%--4 і 5--%>
<%--<h2>Survey Form</h2>--%>
<%--<form action="SurveyServlet" method="post">--%>
<%--    <label for="fullName">Full Name:</label><br>--%>
<%--    <input type="text" id="fullName" name="fullName" required><br>--%>

<%--    <label for="phone">Phone:</label><br>--%>
<%--    <input type="tel" id="phone" name="phone" required><br>--%>

<%--    <label for="email">Email:</label><br>--%>
<%--    <input type="email" id="email" name="email" required><br>--%>

<%--    <label for="age">Age:</label><br>--%>
<%--    <input type="number" id="age" name="age" required><br>--%>

<%--    <input type="submit" value="Submit">--%>
<%--</form>--%>

<%--6 i 7--%>
<%--<h2>Survey Form</h2>--%>
<%--<form action="SurveyServlet" method="post">--%>
<%--    <label for="fullName">Full Name:</label><br>--%>
<%--    <input type="text" id="fullName" name="fullName" required><br>--%>

<%--    <label for="phone">Phone:</label><br>--%>
<%--    <input type="tel" id="phone" name="phone" required><br>--%>

<%--    <label for="email">Email:</label><br>--%>
<%--    <input type="email" id="email" name="email" required><br>--%>

<%--    <label for="age">Age:</label><br>--%>
<%--    <input type="number" id="age" name="age" required><br>--%>

<%--    <input type="checkbox" id="subscribe" name="subscribe">--%>
<%--    <label for="subscribe">Subscribe to our newsletter</label><br>--%>

<%--    <label for="gender">Gender:</label><br>--%>
<%--    <select id="gender" name="gender" required>--%>
<%--        <option value="Male">Male</option>--%>
<%--        <option value="Female">Female</option>--%>
<%--        <option value="Other">Other</option>--%>
<%--    </select><br>--%>

<%--    <input type="submit" value="Submit">--%>
<%--</form>--%>

<%--task hw 2--%>
<h2>Enter Three Numbers</h2>
<form action="MaxNumberServlet" method="post">
    <label for="num1">Number 1:</label>
    <input type="number" id="num1" name="num1" required><br><br>

    <label for="num2">Number 2:</label>
    <input type="number" id="num2" name="num2" required><br><br>

    <label for="num3">Number 3:</label>
    <input type="number" id="num3" name="num3" required><br><br>

    <input type="submit" value="Find Maximum">
</form>
</body>
</html>