<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to our Application</h2>
<h4> Roll Number : <%=request.getAttribute("roll_no") %></h4>

	<h4>  Name : <%=request.getAttribute("name") %></h4>
	  
	<h4>  Age : <%=request.getAttribute("age") %></h4>
	  
	<h4>  Course : <%=request.getAttribute("course") %></h4>
	  
	<h4>  Course Duration : <%=request.getAttribute("course_duration") %> </h4>


</body>
</html>