package com.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "123456");
		PreparedStatement ps = cn.prepareStatement("update car set sl ='4' where owner = 'anand'");
		int rs = ps.executeUpdate();
		System.out.println("Data is Deleted "+rs);
	
	}

}
