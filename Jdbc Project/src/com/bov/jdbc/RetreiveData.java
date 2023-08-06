package com.bov.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import com.mysql.jdbc.ResultSet;

public class RetreiveData 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhudb","root","");
		Statement stmt = con.createStatement();
		ResultSet rs = (ResultSet) stmt.executeQuery("select * from collegedb");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		con.close();
		System.out.println("Retreived Successfully");
	}
	
}
