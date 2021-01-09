<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" import="java.util.List, com.quiz.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<% Questions questions = (Questions)request.getAttribute("qid");  %> 

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Create Quiz <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="addQuiz">Add Quiz</a></li>
            <li><a href="updateQuiz">Update Quiz</a></li>
            <li><a href=deleteQuiz?requestAction=delete&qid=<%questions.getQid(qid) %>">Delete Quiz</a></li>
          </ul>
        </li>
        <li><a href="#">Take Test</a></li>
        <li><a href="#"> Contact Us</a></li>
        <li><a href="#"> About Us</a></li>
        <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      </ul>
      </ul>
     
    </div>
  </div>
</nav>
  


</body>
</html>
