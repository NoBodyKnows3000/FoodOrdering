package com.example.foodorder.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/food")
public class FoodServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Welcome to Food Ordering App</h2>");
        out.println("<p>Menu:</p>");
        out.println("<ul>");
        out.println("<li>Pizza - ₹250</li>");
        out.println("<li>Burger - ₹150</li>");
        out.println("<li>Pasta - ₹200</li>");
        out.println("</ul>");
        out.println("<a href='index.jsp'>Go Back</a>");
        out.println("</body></html>");
    }
}
