package com.bov.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class MyServlet implements Servlet {


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Basic web application using Servlet Interface");
	
	}	
	
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}



	public void destroy() {
		// TODO Auto-generated method stub
	}



	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

}
