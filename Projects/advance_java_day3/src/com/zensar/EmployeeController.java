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
		
		String city = request.getParameter("city");


		EmployeeRepository employeeRepository = new EmployeeRepository();
		EmployeeBean e1 = new EmployeeBean(emp_id, emp_name, designation, salary, gender,city);
		 employeeRepository.addEmp(e1);
		 
		//RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		 
		 request.setAttribute("emp_id", emp_id);
		 request.setAttribute("emp_name", emp_name);
		 request.setAttribute("designation", designation);
		 request.setAttribute("salary", salary);
		 request.setAttribute("gender", gender);
		 request.setAttribute("city", city);

		 
		 try {
			//rd.forward(request, response);
			response.sendRedirect("index.jsp");

			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("I am inside doGet() method now...");
		String requestAction = request.getParameter("requestAction");
		
		if(requestAction.equalsIgnoreCase("viewAll")) {
			
		EmployeeRepository employeeRepository = new EmployeeRepository();
		List<EmployeeBean> listOfAllEmployees = employeeRepository.getAllEmployees();
		System.out.println("listOfAllEmployees:"+listOfAllEmployees);
		RequestDispatcher rd = request.getRequestDispatcher("viewEmployeeForm.jsp");
		request.setAttribute("listOfAllEmployees", listOfAllEmployees);
		System.out.println(listOfAllEmployees);
		try {
		rd.forward(request, response);
					}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		}
		else if(requestAction.equalsIgnoreCase("delete")) {
			// code for employee deletion
			System.out.println("We are going to delete an employee");
			EmployeeRepository employeeRepository = new EmployeeRepository();
			int emp_id = Integer.parseInt(request.getParameter("emp_id"));
			employeeRepository.deleteEmployee(emp_id);
			//RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			try {
			//rd.forward(request, response);
				response.sendRedirect("index.jsp");

			}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
			}
		
		else if(requestAction.equalsIgnoreCase("update"))
		{
			System.out.println("We are updating Employee details");
			int emp_id = Integer.parseInt(request.getParameter("emp_id"));
			
			// connect to db using repository and fetch the details of the employee
			EmployeeRepository employeeRepository = new EmployeeRepository();
			EmployeeBean employee = employeeRepository.updateEmployee(emp_id);

			RequestDispatcher rd = request.getRequestDispatcher("updateEmployeeForm.jsp");
			request.setAttribute("employee", employee);
			try {
			rd.forward(request, response);
				//response.sendRedirect("index.jsp");
			

			}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
		}
		
		else if(requestAction.equalsIgnoreCase("updateEmployee")) {
			int emp_id = Integer.parseInt(request.getParameter("emp_id"));
			String emp_name = request.getParameter("emp_name");
			String designation = request.getParameter("designation");
			int salary = Integer.parseInt(request.getParameter("salary"));
			String gender = request.getParameter("gender");
			String city = request.getParameter("city");
			EmployeeBean employee = new EmployeeBean(emp_id, emp_name, designation, salary, gender, city);
			EmployeeRepository employeeRepository = new EmployeeRepository();
			employeeRepository.updateEmployee(employee);
			try {
			response.sendRedirect("index.jsp");
			}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
			}

		}

	
}

