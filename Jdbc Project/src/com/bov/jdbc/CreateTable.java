package com.bov.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTable 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhudb","root","");
		Statement stmt = con.createStatement();
		String sql = "create table collegedb(id int, name varchar(30), address varchar(30))";
		stmt.executeUpdate(sql);
		con.close();
		System.out.println("Table created successfully");
	}

}
