<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dojo Survey</title>
</head>
<body>
	<form method="POST" action="/survey">
		<label>Your Name: <input type="text" name="name" /></label><br>
		<label> Dojo Location: 
			<select name="location">
				<option value="San Jose">San Jose</option>
				<option value="LA">LA</option>
				<option value="Seattle">Seattle</option>
			</select>
		</label><br>
		<label>Favorite Language: 
			<select name="language">
				<option value="Python">Python</option>
				<option value="MERN">MERN</option>
				<option value="Java">Java</option>
			</select>
		</label><br>
		<label>Comment (optional): <br><textarea name="comment" ></textarea></label><br>
		<input type="submit" value="Submit!"/>
	</form>
</body>
</html>