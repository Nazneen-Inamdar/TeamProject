package com.zensar;

import java.io.IOException;

import javax.servlet.http.*;

public class StudentController extends HttpServlet {
	
	public void doPost(HttpServletRequest request , HttpServletResponse response)
	{
		int roll_no= Integer.parseInt(request.getParameter("roll_no"));
		String name=request.getParameter("name");
		String course=request.getParameter("course");
		int duration=Integer.parseInt(request.getParameter("duration"));
		String gender=request.getParameter("gender");
		String city=request.getParameter("city");
		
		StudentRepository sr1 = new StudentRepository();
		StudentBean b1 = new StudentBean(roll_no,name,course,duration,gender,city);
		sr1.addStudent(b1);
		
		request.setAttribute("roll_no", roll_no);
		request.setAttribute("name", name);
		request.setAttribute("course", course);
		request.setAttribute("duration", duration);
		request.setAttribute("gender", gender);
		request.setAttribute("city", city);
		
		try {
			response.sendRedirect("index.jsp");
		} catch (IOException e) {
			System.out.println("Error Occured "+e);
		}
	}

}
