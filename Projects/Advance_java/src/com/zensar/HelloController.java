package com.zensar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloController extends HttpServlet{
	
	public void doGet(HttpServletRequest request , HttpServletResponse response)
	{
		String name = request.getParameter("userName");
		String city = request.getParameter("city");
		System.out.println("Hello  "+name);
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		request.setAttribute("name", name);
		request.setAttribute("city", city );
		
		try {
			rd.forward(request, response);
		} catch (Exception e) {
System.out.println("Error occured "+e);		
} 
		
	}
}
