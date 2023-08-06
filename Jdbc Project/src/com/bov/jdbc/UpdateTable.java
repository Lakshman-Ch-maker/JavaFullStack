package com.bov.jdbc;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class UpdateTable 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhudb","root","");
		Statement stmt = con.createStatement();
		String sql = "update employee set name='ailu', address = 'chennai' where id = 101";
		stmt.executeUpdate(sql);
		con.close();
		System.out.println("updated successfully");
	}
}
