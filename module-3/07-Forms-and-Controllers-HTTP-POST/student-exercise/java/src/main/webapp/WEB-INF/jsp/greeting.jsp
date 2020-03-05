<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
		<h1>Hello, John. <c:out value="${param.name}" /></h1>
		<img height="300px"width="200px" alt= "forDummies" src = "etc/forDummies.png"/>
		<p> Throw a party with Squirrels! Don't be forced to hang with Chipmunks!</p>
		<a href="newReview">New Review</a>
		<table>
		<c:forEach var= "review" items = "${reviews}">
			<tr><td><b>${review.title}</b>(${review.username})</td></tr>
					<tr><td>${review.dateSubmitted }</td></tr>
		<tr><td>
		<c:forEach begin= "1" end = "${review.rating}">
		
		<img alt="star" src = "etc/star.png"/>
		</c:forEach>
		</td></tr>
		<tr><td>${review.text }</td></tr>
		<tr><td></td></tr>
			<tr><td></td></tr>
				<tr><td></td></tr>
					<tr><td></td></tr>
					
		</c:forEach>
		</table>
		
	</body>
</html>