package com.zensar;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zensar.Bean.EmployeeBean;
import Utility.DBUtil;

public class EmployeeRepository {

	public void addEmp(EmployeeBean e1 )
	{
		Connection con = DBUtil.getMySqlDbConnection();
		String sql="insert into employeedetails values(?,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, e1.getEmp_id());
			pst.setString(2, e1.getEmp_name());
			pst.setString(3, e1.getDesignation());
			pst.setInt(4, e1.getSalary());
			pst.setString(5, e1.getGender());
			
			int res = pst.executeUpdate();
			if(res==0)
			{
				System.out.println("Data Operation failed");
			}
			else
			{
				System.out.println(" Data Operation Successfull");
			}

		} catch (SQLException e) {
			System.out.println("Error Occured"+e);
		}
	}
	
    
	
	public List<EmployeeBean> getAllEmployees(){
		List<EmployeeBean> listOfAllEmployees = new ArrayList<EmployeeBean>();
		// jdbc code to fetch all employees from db and add them to this list
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from employeedetails";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
		int emp_id = rs.getInt("emp_id");
		String emp_name = rs.getString("emp_name");
		String designation = rs.getString("designation");
		int salary = rs.getInt("salary");
		String gender = rs.getString("gender");
		EmployeeBean employee = new EmployeeBean(emp_id, emp_name, designation, salary, gender);
		listOfAllEmployees.add(employee);
		}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		System.out.println("listOfAllEmployees:"+listOfAllEmployees);
		return listOfAllEmployees;
		}
}