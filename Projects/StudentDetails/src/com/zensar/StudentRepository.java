package com.zensar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Utility.DBUtil;

public class StudentRepository {
	
	public void addStudent(StudentBean b1)
	{
		Connection con=DBUtil.getMySqlDbConnection();
		String sql="insert into studentdetails values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, b1.getRoll_no());
			ps.setString(2, b1.getName());
			ps.setString(3, b1.getCourse());
			ps.setInt(4, b1.getCourse_duration());
			ps.setString(5, b1.getGender());
			ps.setString(6, b1.getCity());
			
			int res = ps.executeUpdate();
			
			if(res==0) {
				System.out.println("Insertion Failed");
				
			}
			else
			{
				System.out.println("Insertion Successfull");
			}
		
			
		} catch (SQLException e) {
			System.out.println("Error Occurred "+e);
		}
		
	}
	
	public List<StudentBean> getAllStudents()
	{
		List<StudentBean> b1 = new ArrayList<StudentBean>();
		Connection con = DBUtil.getMySqlDbConnection();
		String sql="Select * from studentdetails";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int roll_no=rs.getInt("roll_no");
				String name=rs.getString("name");
				String course=rs.getString("course");
				
				
			}
		} catch (SQLException e) {
			System.out.println("Error Occurred "+e);
		}
		
		
		return b1;
		
		
	}

}
