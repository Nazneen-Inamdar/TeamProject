<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.zensar.Bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% EmployeeBean employee = (EmployeeBean)request.getAttribute("employee"); %>

<body>
<h2>Welcome to Update Form</h2>

    
<form action="updateEmployee" method="get">
<input type="hidden" name="requestAction" value="updateEmployee" />
<table>
<tr>
<td>Employee Id: </td>
 <td><input type="text" name="emp_id" value="<%=employee.getEmp_id() %>"><td>
</tr>

<tr>
<td>Employee Name: </td>
 <td><input type="text" name="emp_name" value="<%=employee.getEmp_name() %>"><td>
</tr>



<tr>
<td>Designation: </td>
 <td><input type="text" name="designation" value="<%=employee.getDesignation() %>"><td>
</tr>

<tr>
<td>Salary: </td>
 <td><input type="text" name="salary" value="<%=employee.getSalary() %>"><td>
</tr>

<tr>
<td>Gender: 

 <td> <input type="radio"  name="gender" value="male"<% if(employee.getGender().equalsIgnoreCase("male")){ %>checked<%} %>> Male
  <input type="radio"  name="gender" value="female"<%if(employee.getGender().equalsIgnoreCase("female")){%>checked<%}  %>>Female</td>
  
 </td>
</tr>

<tr>
<td>City:</td>
<td>
<select name="city">
<option value="city" label="Pune" <%if(employee.getCity().equalsIgnoreCase("Pune")){ %>selected<%} %> > </option>
<option value="city" label="Mumbai" <%if(employee.getCity().equalsIgnoreCase("Mumbai")){ %>selected<%} %>></option>
<option value="city" label="Delhi" <%if(employee.getCity().equalsIgnoreCase("Delhi")){ %>selected<%} %>></option>
</select>
</td>

 </tr>

<td>&nbsp</td>
<td><input type="submit" value="Update Employee" ></td>
</table>
</form>

</body>
</html>