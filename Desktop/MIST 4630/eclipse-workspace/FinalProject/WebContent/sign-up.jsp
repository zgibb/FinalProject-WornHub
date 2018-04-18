<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WornHub</title>
<link rel = "stylesheet" type = "text/css" href = "style.css" />
</head>
<body>

<div class="topnav">
  <a class="active" href="main.jsp">Home</a>
  <a href="#news">News</a>
  <a href="#contact">Contact</a>
  <a href="#about">About</a>
</div>


<h2>Sign-up Form</h2>

<form name=addUser action=addUser method=post>
 
  <div class="container">
	<label for="firstName"><b>First Name</b></label>
    <input type="text" placeholder="John" name="FirstName" required>
    </br>
    
    <label for="lastName"><b>Last Name</b></label>
    <input type="text" placeholder="Doe" name="LastName" required>
    </br>
    
    <label for="emailAddress"><b>Email Address</b></label>
    <input type="text" placeholder="Enter Email Address" name="EmailAddress" required>
    </br>
    
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="UserName" required>
	</br>
	
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="Password" required>
    </br>
        
     <input type=submit name=submit value="Sign In!" />
  </div>
</form>

</body>

</body>
</html>