package org.example.demo;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/SurveyServlet")
//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
/* lab task */
        /* task 1 */
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Martin Fowler Quote</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>Any fool can write code that a computer can understand.</h1>");
//        out.println("<h2>Good programmers write code that humans can understand.</h2>");
//        out.println("</body>");
//        out.println("</html>");

        /* task 2 */
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Multiplication Table</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h2>Enter a number to display its multiplication table:</h2>");
//        out.println("<form action='' method='post'>");
//        out.println("Number: <input type='text' name='number'><br>");
//        out.println("<input type='submit' value='Generate Table'>");
//        out.println("</form>");
//
//        String numberStr = request.getParameter("number");
//        if (numberStr != null && !numberStr.isEmpty()) {
//            try {
//                int number = Integer.parseInt(numberStr);
//                out.println("<h2>Multiplication Table for " + number + ":</h2>");
//                out.println("<table border='1'>");
//                for (int i = 1; i <= 10; i++) {
//                    out.println("<tr><td>" + number + " * " + i + " = </td><td>" + (number * i) + "</td></tr>");
//                }
//                out.println("</table>");
//            } catch (NumberFormatException e) {
//                out.println("<p>Please enter a valid number.</p>");
//            }
//        }
//
//        out.println("</body>");
//        out.println("</html>");

        /* task 3 */
//        HttpSession session = request.getSession();
//        Integer randomNumber = (Integer) session.getAttribute("randomNumber");
//        if (randomNumber == null) {
//            randomNumber = (int) (Math.random() * 100) + 1;
//            session.setAttribute("randomNumber", randomNumber);
//        }
//
//        String guessParameter = request.getParameter("guess");
//        Integer guess = null;
//        if (guessParameter != null) {
//            try {
//                guess = Integer.parseInt(guessParameter);
//            } catch (NumberFormatException e) {
//            }
//        }
//
//        response.setContentType("text/html");
//
//        out.println("<html><head><title>Guess the Number</title></head><body>");
//
//        if (guess == null) {
//            out.println("<h2>Guess the number between 1 and 100</h2>");
//        } else {
//            if (guess > randomNumber) {
//                out.println("<h2>The number is smaller than " + guess + "</h2>");
//            } else if (guess < randomNumber) {
//                out.println("<h2>The number is greater than " + guess + "</h2>");
//            } else {
//                out.println("<h2>Congratulations! You've guessed the number: " + guess + "</h2>");
//                session.removeAttribute("randomNumber");
//            }
//        }
//
//        out.println("<form method=\"get\">");
//        out.println("<input type=\"text\" name=\"guess\">");
//        out.println("<input type=\"submit\" value=\"Guess\">");
//        out.println("</form>");
//
//        out.println("</body></html>");

        /* hw task  */
        /* task 1 */
        String quote = "Bad programmers worry about the code. Good programmers worry about data structures and their relationships.";

        response.getWriter().println("<html><head><title>Quote by Linus Torvalds</title></head><body>");
        response.getWriter().println("<h2>Quote by Linus Torvalds:</h2>");
        response.getWriter().println("<p>" + quote + "</p>");
        response.getWriter().println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        /* lab task */
        /* task 4 */
//        String fullName = request.getParameter("fullName");
//        String phone = request.getParameter("phone");
//        String email = request.getParameter("email");
//        int age = Integer.parseInt(request.getParameter("age"));
//
//        response.setContentType("text/html");
//        out.println("<html><head><title>Survey Results</title></head><body>");
//        out.println("<h2>Survey Results:</h2>");
//        out.println("<p>Full Name: " + fullName + "</p>");
//        out.println("<p>Phone: " + phone + "</p>");
//        out.println("<p>Email: " + email + "</p>");
//        out.println("<p>Age: " + age + "</p>");
//        out.println("</body></html>");

        /* task 5 */
//        String fullName = request.getParameter("fullName");
//        String phone = request.getParameter("phone");
//        String email = request.getParameter("email");
//        int age = Integer.parseInt(request.getParameter("age"));
//        String subscribe = request.getParameter("subscribe");
//
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<html><head><title>Survey Results</title></head><body>");
//        out.println("<h2>Survey Results:</h2>");
//        out.println("<p>Full Name: " + fullName + "</p>");
//        out.println("<p>Phone: " + phone + "</p>");
//        out.println("<p>Email: " + email + "</p>");
//        out.println("<p>Age: " + age + "</p>");
//        out.println("<p>Subscribe to newsletter: " + (subscribe != null ? "Yes" : "No") + "</p>");
//        out.println("</body></html>");

        /* task 6*/
//        String fullName = request.getParameter("fullName");
//        String phone = request.getParameter("phone");
//        String email = request.getParameter("email");
//        int age = Integer.parseInt(request.getParameter("age"));
//        String subscribe = request.getParameter("subscribe");
//        String gender = request.getParameter("gender");
//
//        response.setContentType("text/html");
//        out.println("<html><head><title>Survey Results</title></head><body>");
//        out.println("<h2>Survey Results:</h2>");
//        out.println("<p>Full Name: " + fullName + "</p>");
//        out.println("<p>Phone: " + phone + "</p>");
//        out.println("<p>Email: " + email + "</p>");
//        out.println("<p>Age: " + age + "</p>");
//        out.println("<p>Subscribe to newsletter: " + (subscribe != null ? "Yes" : "No") + "</p>");
//        out.println("<p>Gender: " + gender + "</p>");
//        out.println("</body></html>");

        /* task 7*/
//        String fullName = request.getParameter("fullName");
//        String phone = request.getParameter("phone");
//        String email = request.getParameter("email");
//        String ageString = request.getParameter("age");
//        String subscribe = request.getParameter("subscribe");
//        String gender = request.getParameter("gender");
//
//        boolean isValid = true;
//        StringBuilder errorMessage = new StringBuilder();
//
//        if (fullName == null || fullName.isEmpty()) {
//            isValid = false;
//            errorMessage.append("Please enter your full name. ");
//        }
//
//        if (phone == null || phone.isEmpty()) {
//            isValid = false;
//            errorMessage.append("Please enter your phone number. ");
//        }
//
//        if (email == null || email.isEmpty() || !email.contains("@")) {
//            isValid = false;
//            errorMessage.append("Please enter a valid email address. ");
//        }
//
//        int age = 0;
//        try {
//            age = Integer.parseInt(ageString);
//            if (age <= 0) {
//                throw new NumberFormatException();
//            }
//        } catch (NumberFormatException e) {
//            isValid = false;
//            errorMessage.append("Please enter a valid age. ");
//        }
//
//        response.setContentType("text/html");
//        if (isValid) {
//            out.println("<html><head><title>Survey Results</title></head><body>");
//            out.println("<h2>Survey Results:</h2>");
//            out.println("<p>Full Name: " + fullName + "</p>");
//            out.println("<p>Phone: " + phone + "</p>");
//            out.println("<p>Email: " + email + "</p>");
//            out.println("<p>Age: " + age + "</p>");
//            out.println("<p>Subscribe to newsletter: " + (subscribe != null ? "Yes" : "No") + "</p>");
//            out.println("<p>Gender: " + gender + "</p>");
//            out.println("</body></html>");
//        } else {
//            out.println("<html><head><title>Error</title></head><body>");
//            out.println("<h2>Error:</h2>");
//            out.println("<p>" + errorMessage.toString() + "</p>");
//            out.println("<p><a href=\"survey-form.html\">Back to survey form</a></p>");
//            out.println("</body></html>");
//        }

        /* hw task  */
        /* task 1 */

    }

    /* task 2 */
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        doGet(request, response);
//    }

    public void destroy() {
    }
}