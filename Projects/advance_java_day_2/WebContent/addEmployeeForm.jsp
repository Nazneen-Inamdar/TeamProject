<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
<form action="add_employee" method="post">
<table>
<tr>
<td>Employee Id: </td>
 <td><input type="text" name="emp_id"><td>
</tr>

<tr>
<td>Employee Name: </td>
 <td><input type="text" name="emp_name"><td>
</tr>



<tr>
<td>Designation: </td>
 <td><input type="text" name="designation"><td>
</tr>

<tr>
<td>Salary: </td>
 <td><input type="text" name="salary"><td>
</tr>

<tr>
<td>Gender: 

 <td> <input type="radio"  name="gender" value="male"> Male
  <input type="radio"  name="gender" value="female">Female</td>
  
 </td>
</tr>

<td>&nbsp</td>
<td><input type="submit" value="add"></td>
</table>
</form>

</body>
</html>