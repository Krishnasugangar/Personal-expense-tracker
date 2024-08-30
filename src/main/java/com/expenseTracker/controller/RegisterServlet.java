package com.expenseTracker.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle GET request
        response.getWriter().write("GET request handled");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get form parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Example logic to handle registration (e.g., saving to database)
        if (username != null && password != null) {
            // Assume successful registration
            response.getWriter().write("User " + username + " registered successfully.");
        } else {
            response.getWriter().write("Registration failed. Please fill in all fields.");
        }
    }
}
