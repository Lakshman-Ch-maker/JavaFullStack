package com.bov.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("driverName");
		String url = config.getInitParameter("url");
		out.println("Driver Name : "+name+"<br>");
		out.println("URL : "+url);
	}

}