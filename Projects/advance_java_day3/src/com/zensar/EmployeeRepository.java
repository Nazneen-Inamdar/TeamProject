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
		String sql="insert into employeedetails values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, e1.getEmp_id());
			pst.setString(2, e1.getEmp_name());
			pst.setString(3, e1.getDesignation());
			pst.setInt(4, e1.getSalary());
			pst.setString(5, e1.getGender());
			pst.setString(6, e1.getCity());

			
			
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
		String city = rs.getString("city");
		EmployeeBean employee = new EmployeeBean(emp_id, emp_name, designation, salary, gender,city);
		listOfAllEmployees.add(employee);
		}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		System.out.println("listOfAllEmployees:"+listOfAllEmployees);
		return listOfAllEmployees;
		}
	
	public void deleteEmployee(int emp_id) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "delete from employeedetails where emp_id=?";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, emp_id);
		int result = pst.executeUpdate();
		if(result==0) {
		System.out.println("Deletion Failed");
		}else {
		System.out.println("Deletion Successful");
		}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		}
	
	public EmployeeBean updateEmployee(int emp_id)
	{
		EmployeeBean employee=null;
		//jdbc code to connect to db and fetch employee with this id
		
		Connection con = DBUtil.getMySqlDbConnection();
		String sql ="select * from employeedetails where emp_id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, emp_id);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				emp_id = rs.getInt("emp_id");
				String emp_name = rs.getString("emp_name");
				String designation = rs.getString("designation");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");
				String city = rs.getString("city");

				employee = new EmployeeBean(emp_id, emp_name, designation, salary, gender,city);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
		
	}
	public void updateEmployee(EmployeeBean employee) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "update employeedetails set emp_name=?, designation=?, salary=?, gender=?, city=? where emp_id=?";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, employee.getEmp_name());
		pst.setString(2, employee.getDesignation());
		pst.setInt(3, employee.getSalary());
		pst.setString(4, employee.getGender());
		pst.setString(5, employee.getCity());
		pst.setInt(6, employee.getEmp_id());
		pst.executeUpdate();

		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		}
	

}