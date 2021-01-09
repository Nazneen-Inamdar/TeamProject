package day8.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.jdbc.Connection;

public class Example2 {

	public static void main(String[] args) {
		
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/details";
		String dbUserName = "root";
		String dbPassword = "root";
		try {
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
		System.out.println("Connection: "+con);
		String sql = "select * from login";
		// giving demo using PreparedStatement
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery(); // for select queries, we use executeQury() method
		while(rs.next()) {
		String userName = rs.getString("username");
		String password = rs.getString("password");
		System.out.println("userName:"+userName);
		System.out.println("password:"+password);
		System.out.println("**************************");
		}
		
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}

	}

}
