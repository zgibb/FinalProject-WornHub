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
  <a class="active" href="login.jsp">Home</a>
  <a href="login.jsp">News</a>
  <a href="login.jsp">Contact</a>
  <a href="login.jsp">About</a>
</div>


<h2>Login Form</h2>

<form action="/login">
  <div class="imgcontainer">
    <img src="/FinalProject/WebContent/images/signInImg.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
    </br>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
    </br>
        
    <button type="submit">Login</button>
  </div>
</form>

</body>

</body>
</html>