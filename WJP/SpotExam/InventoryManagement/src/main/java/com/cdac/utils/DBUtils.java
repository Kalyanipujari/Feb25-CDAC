package com.cdac.utils;
import java.sql.Connection;

import jakarta.servlet.ServletContext;

import java.sql.*;
public class DBUtils {
	
	private static Connection conn;
	
	public static Connection openConnection(ServletContext context) throws SQLException
	{
		String dbURL = context.getInitParameter("db_url");
		String user = context.getInitParameter("user_name");
		String pass = context.getInitParameter("password");
	if(conn == null)
		try {
			conn=DriverManager.getConnection(dbURL,user, pass);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection() throws SQLException {
		if(conn !=null )
			conn.close();
	}
}
