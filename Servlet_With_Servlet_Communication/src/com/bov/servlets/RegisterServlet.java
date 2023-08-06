package com.bov.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uName");
		String mail = request.getParameter("eMail");
		String addr = request.getParameter("address");
		if(name.equals("admin"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("LoginServlet");
			rd.forward(request,  response);
		}
		else
		{
			out.println("Incorrect username or password");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
			
		}
		
		
		}

}
