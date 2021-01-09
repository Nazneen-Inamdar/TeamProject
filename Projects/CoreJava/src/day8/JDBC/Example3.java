package day8.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// insert login table using Statement
public class Example3 {
	public static void main(String[] args)
	{
		Connection con = getMySqlDbConnection();
		String sql="insert into login values('Muzammil','Abc123')";
		
		try
		{
			Statement st =con.createStatement();
			int res = st.executeUpdate(sql); // this method can be used for inserting, updating, deleting queries
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
