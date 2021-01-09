package day8.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

// insert login table using PreparedStatement
public class Example4{
	public static void main(String[] args)
	{
		Connection con = getMySqlDbConnection();
		String sql="insert into login values(?,?)";
		
		try
		{
			PreparedStatement pst =con.prepareStatement(sql);
			pst.setString(1, "User"); // this method takes index as argument and corresponding value to be inserted as 2nd argument
			pst.setString(2, "Pass");// here 1 means first col and 2 means 2nd column
			int res = pst.executeUpdate(); // this method can be used for inserting, updating, deleting queries
		 if (res==0)
		 {
			 System.out.println("Insertion failed");
		 }
		 else
		 {
			 System.out.println("Data inserted successfully");
		 }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static Connection getMySqlDbConnection()
	{   String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/details";
		String dbUserName="root";
		String dbPassword="root";
		Connection con = null;
		try
		{
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url,dbUserName,dbPassword);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception while creating db connection"+e);
			
		}
		return con;
	}

}
