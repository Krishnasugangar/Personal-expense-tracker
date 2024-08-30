package com.expenseTracker.controller;

import java.io.IOException;

import com.expenseTracker.dao.UserDAO;
import com.expenseTracker.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDAO userDAO = new UserDAO();
		User user = userDAO.getUserByUsername(username);

		if(user!=null && user.getPassword().equals(password)) {
			request.getSession().setAttribute("user",user);
			response.sendRedirect("dashboard.jsp");

		}else {
			response.sendRedirect("login.jsp?error=true");

		}

	}

}
