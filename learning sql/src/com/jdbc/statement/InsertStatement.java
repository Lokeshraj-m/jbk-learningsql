package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "123456");
		Statement st = cn.createStatement();
		String query ="insert into car (sl,owner,car) values ('3','anand','benelli')";
		int rs = st.executeUpdate(query);
		System.out.println("Data is inserted " + rs);
		}
	}
