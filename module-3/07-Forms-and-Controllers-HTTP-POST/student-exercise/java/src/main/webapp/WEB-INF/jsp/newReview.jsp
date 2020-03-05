<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>New Post</title>
</head>


<body>
	<div id=main-content>
		<h2>New Review</h2>
		<c:url var="formAction" value="/newReview" />
		<form method="POST" action="${formAction}">
			<div class="formInputGroup">
				<label for="username">Username</label> 
				<input type="text" name="username" id="username" />
			</div>
			<div class="formInputGroup">
				<label for="Title">Title</label> 
				<input type="text" name="title" id="title" />
			</div>
				<div class="formInputGroup">
				<label for="text">text</label> 
				<input type="text" name="text" id="text" />
			</div>
	</div>
			<div class="formInputGroup">
				<label for="Rating">Choose a Rating</label> <select name="rating"
					id="rating">
					<option value="1">One Star</option>
					<option value="2">Two Star</option>
					<option value="3">Three Star</option>
					<option value="4">Four Star</option>
					<option value="5">Five Star</option>
				</select>
			</div>
			<input class="formSubmitButton" type="submit" value="Submit" />
				</form>
</body>
