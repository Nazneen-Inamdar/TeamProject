package com.zensar;

import javax.servlet.http.HttpServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ControllerClass extends HttpServlet {
	
	public void doGet(HttpServletRequest request , HttpServletResponse response)
	{
		String roll_no = request.getParameter("roll_no");
		
		String name = request.getParameter("name");
		
		System.out.println("Hello  "+name);

		String age = request.getParameter("age");

		String course = request.getParameter("course");

		String course_duration = request.getParameter("course_duration");
		
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		
		request.setAttribute("roll_no", roll_no);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("course", course);
		request.setAttribute("course_duration", course_duration);
		
		try {
			rd.forward(request, response);
		} catch (Exception e) {
			System.out.println("Error Occurred"+e);
		} 


		
	}
	

}
