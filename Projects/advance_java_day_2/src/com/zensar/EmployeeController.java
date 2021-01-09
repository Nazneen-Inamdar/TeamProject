package com.zensar;


import java.io.IOException; 
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.zensar.Bean.EmployeeBean;

public class EmployeeController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		int emp_id=Integer.parseInt(request.getParameter("emp_id"));
		
		String emp_name=request.getParameter("emp_name");
		
		String designation=request.getParameter("designation");
		
		int salary=Integer.parseInt(request.getParameter("salary"));
		
		String gender = request.getParameter("gender");

		EmployeeRepository employeeRepository = new EmployeeRepository();
		EmployeeBean e1 = new EmployeeBean(emp_id, emp_name, designation, salary, gender);
		 employeeRepository.addEmp(e1);
		 
		 RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		 
		 request.setAttribute("emp_id", emp_id);
		 request.setAttribute("emp_name", emp_name);
		 request.setAttribute("designation", designation);
		 request.setAttribute("salary", salary);
		 request.setAttribute("gender", gender);
		 
		 try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("I am inside doGet() method now...");
		EmployeeRepository employeeRepository = new EmployeeRepository();
		List<EmployeeBean> listOfAllEmployees = employeeRepository.getAllEmployees();
		System.out.println("listOfAllEmployees:"+listOfAllEmployees);
		RequestDispatcher rd = request.getRequestDispatcher("viewEmployeeForm.jsp");
		request.setAttribute("listOfAllEmployees", listOfAllEmployees);
		try {
		rd.forward(request, response);
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		}

}

