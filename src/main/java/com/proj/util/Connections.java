package com.proj.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
	
	static Connection con = null;
	private static String url = "jdbc:mysql://localhost:3306/food_project_tap";
	private static String name ="root";
	private static String pass = "Zeeshan9";
	
	
	public static Connection getConnection() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,name,pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
	

}
