<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>modo web: activado</title>
<style>
	body{
		text-align: center;
		margin-left: 35%;
		margin-right:35%;
	}
	input[type=submit]{
		font-weight:bold;
		cursor: pointer;
	}
	input[type=email],input[type=password],input[type=submit] {
	  	width: 100%;
	  	padding: 12px 20px;
	  	margin: 8px 0;
	  	box-sizing: border-box;
	  	border: 3px solid #ccc;
		-webkit-transition: 0.5s;
		transition: 0.5s;
	  	outline: none;
	}
	input[type=email]:hover,input[type=password]:hover,input[type=submit]:hover{
	  border: 3px solid #555;
	}
</style>
</head>
<body>
	<h2><marquee behavior="scroll" direction="left" scrollamount="10">
	Login Page</marquee></h2>
	<form method="post" action="LoginSuccess">
		<label><b>Email Id&darr;</b></label>
		<input type="email" id="email" name="email" required><br><hr size="3%" noshade><br>
		<label><b>Password&darr;</b></label>
		<input type="password" id="pwd" name="pwd" required><br><hr size="3%" noshade><br>
		<input type="submit" id="submit" value="Submit"><br><br>
	</form>
</body>
</html>