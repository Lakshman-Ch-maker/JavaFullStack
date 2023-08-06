package com.bov.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uName");
		String mail = request.getParameter("eMail");
		String addr = request.getParameter("address");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhudb","root","");
			PreparedStatement stmt = con.prepareStatement("insert into register values(?,?,?)");
			stmt.setString(1,  name);
			stmt.setString(2, mail);
			stmt.setString(3, addr);
			int i = stmt.executeUpdate();
			if(i > 0)
			{
				out.println("successfully registered");
			}
		}
		catch(Exception e)
		{
			
		}
		
	}

}
