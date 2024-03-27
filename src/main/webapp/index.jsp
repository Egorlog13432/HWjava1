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
<%--<h2>Enter Three Numbers</h2>--%>
<%--<form action="MaxNumberServlet" method="post">--%>
<%--    <label for="num1">Number 1:</label>--%>
<%--    <input type="number" id="num1" name="num1" required><br><br>--%>

<%--    <label for="num2">Number 2:</label>--%>
<%--    <input type="number" id="num2" name="num2" required><br><br>--%>

<%--    <label for="num3">Number 3:</label>--%>
<%--    <input type="number" id="num3" name="num3" required><br><br>--%>

<%--    <input type="submit" value="Find Maximum">--%>
<%--</form>--%>

<%--task hw 3--%>
<%--<h2>Calculate Numbers</h2>--%>
<%--<form action="CalculateServlet" method="post">--%>
<%--    <label for="number1">Number 1:</label><br>--%>
<%--    <input type="number" id="number1" name="number1" required><br>--%>

<%--    <label for="number2">Number 2:</label><br>--%>
<%--    <input type="number" id="number2" name="number2" required><br>--%>

<%--    <label for="number3">Number 3:</label><br>--%>
<%--    <input type="number" id="number3" name="number3" required><br>--%>

<%--    <input type="radio" id="max" name="operation" value="max" checked>--%>
<%--    <label for="max">Maximum</label><br>--%>

<%--    <input type="radio" id="min" name="operation" value="min">--%>
<%--    <label for="min">Minimum</label><br>--%>

<%--    <input type="radio" id="average" name="operation" value="average">--%>
<%--    <label for="average">Average</label><br>--%>

<%--    <input type="submit" value="Calculate">--%>
<%--</form>--%>

<%--task hw 4--%>
<%--<h2>Text Analysis</h2>--%>
<%--<form action="TextAnalysisServlet" method="post">--%>
<%--    <label for="text">Enter text:</label><br>--%>
<%--    <textarea id="text" name="text" rows="4" cols="50"></textarea><br>--%>
<%--    <input type="submit" value="Analyze">--%>
<%--</form>--%>

<%--task hw 5--%>
<h2>Calculator</h2>
<form action="CalculatorServlet" method="post">
    <label for="num1">Number 1:</label><br>
    <input type="number" id="num1" name="num1" required><br>

    <label for="num2">Number 2:</label><br>
    <input type="number" id="num2" name="num2" required><br>

    <label for="operation">Operation:</label><br>
    <select id="operation" name="operation">
        <option value="add">Addition (+)</option>
        <option value="subtract">Subtraction (-)</option>
        <option value="multiply">Multiplication (*)</option>
        <option value="divide">Division (/)</option>
        <option value="power">Exponentiation (^)</option>
        <option value="percentage">Percentage (%)</option>
    </select><br>

    <input type="submit" value="Calculate">
</form>
</body>
</html>