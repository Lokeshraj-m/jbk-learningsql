package com.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//int sl = 4;
	//String owner = "thulasi";
	//String car = "porsche";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "123456");
	PreparedStatement ps = cn.prepareStatement("insert into car (sl,owner,car) values (?,?,?)");
	ps.setString(1,"6");
	ps.setString(2, "gowtham");
	ps.setString(3, "ambaster");
	int rs = ps.executeUpdate();
	System.out.println("Data is inserted" +rs);

}
}
