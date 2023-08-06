package com.bov.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uName");
		String mail = request.getParameter("eMail");
		String addr = request.getParameter("address");
		out.println("User Name : "+name+"<br>");
		out.println("E-Mail :"+mail+"<br>");
		out.println("Address : "+addr+"<br>");
		
	}

}
