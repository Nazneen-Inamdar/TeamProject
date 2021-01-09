<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 >Add Student Details</h1>

<form action="submit" method=post>

<table>

<tr>
<th> Roll Number : </th>
<td><input type="text" name="roll_no"></td>
</tr>

<tr>
<th> Name : </th>
<td><input type="text" name="name"></td>
</tr>

<tr>
<th> Course : </th>
<td><input type="text" name="course"></td>
</tr>

<tr>
<th> Course Duration : </th>
<td><input type="text" name="duration"></td>
</tr>

<tr>
<th> Gender: </th>
<td><input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female</td>

</tr>

<tr>
<th> City : </th>
<td>
<select name="city">

<option> Pune </option>
<option> Mumbai </option>
<option> Hyderabad </option>
<option> Delhi </option>
<option> Banglore </option>

</select>
</td>
</tr>

<tr>
<td><input type="submit" name="submit"></td>
</tr>


</table>
</form>
</body>
</html>