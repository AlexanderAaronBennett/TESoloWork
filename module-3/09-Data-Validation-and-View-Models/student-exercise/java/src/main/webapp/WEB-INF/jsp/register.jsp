<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<c:set var="pageTitle" value="Register"/>
<%@include file="common/header.jspf" %>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2>Register</h2>
<body>

<c:url value="/register" var="registerFormUrl"/>
<form:form action="${registerFormUrl}" method="POST" modelAttribute="registration">

<div class="form-group">
<form:label path="firstName">First Name</form:label>
<form:input path="firstName" class="form-control"/>
<form:errors path="firstName" cssClass="error"/>
</div>

<div class="form-group">
<form:label path="lastName">Last Name</form:label>
<form:input path="lastName" class="form-control"/>
<form:errors path="lastName" cssClass="error"/>
</div>

<div class="form-group">
<form:label path="email">Email</form:label>
<form:input path="email" class="form-control"/>
<form:errors path="email" cssClass="error"/>
</div>

<div class="form-group">
<form:label path="confirmEmail">Confirm Email</form:label>
<form:input path="confirmEmail" class="form-control"/>
<form:errors path="confirmEmail" cssClass="error"/>
</div>

<div class="form-group">
<form:label path="password">Password</form:label>
<form:input path="password" class="form-control"/>
<form:errors path="password" cssClass="error"/>
</div>

<div class="form-group">
<form:label path="confirmPassword">Confirm Password</form:label>
<form:input path="confirmPassword" class="form-control"/>
<form:errors path="confirmPassword" cssClass="error"/>
</div>

<div class="form-group">
<form:label path="birthDate">Birth Date (YYY-MM-DD format)</form:label>
<form:input path="birthDate" class="form-control"/>
<form:errors path="birthDate" cssClass="error"/>
</div>

<div class="form-group">
<form:label path="numOfTickets">Number of Tickets</form:label>
<form:input type="number" path="numOfTickets" class="form-control"/>
<form:errors path="confirmPassword" cssClass="error"/>
</div>
<input type="submit" value="Register" class="btn btn-primary"/>


</form:form>


</body>
</html>
<%@include file="common/footer.jspf" %>