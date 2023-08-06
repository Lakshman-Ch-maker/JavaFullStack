package com.bov.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertData 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhudb","root","");
		Statement stmt = con.createStatement();
		String sql = "insert into collegedb values(101, 'madhu vundavalli', 'hyderabad')";
		stmt.executeUpdate(sql);
		con.close();
		System.out.println("Inserted successfully");
	}
}
