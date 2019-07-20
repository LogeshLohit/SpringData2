<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body>
	<h1>Welcome to our home page! :)</h1>
	<form action="handleForm" enctype="multipart/form-data" method="post">
		Enter Your User Name:<input type="text" name="userName"> <br></>Select
		file: <input type="file" name="file">
		<button>Submit</button>
	</form>
</body>
</html>