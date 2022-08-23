package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "123456");
		Statement st = con.createStatement();
		String query = "delete from car where sl = '3'";
		int rs = st.executeUpdate(query);
		System.out.println("Data is deleted " +rs);
	}

}
