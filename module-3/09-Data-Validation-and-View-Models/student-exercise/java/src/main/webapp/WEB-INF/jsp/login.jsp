<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<c:set var="pageTitle" value="Login"/>
<%@include file="common/header.jspf" %>
<head>
<meta charset="UTF-8">
<title>Insert Title here</title>
</head>
<h2>Login</h2>
<body>

<c:url value="/login" var="loginFormUrl"/>
<form:form action="${loginFormUrl}" method="POST" modelAttribute="login">

<div class="form-group">
<form:label path="email">Enter email</form:label>
<form:input path="email" class="form-control"/>
<form:errors path="email" cssClass="error"/>
</div>


<div class="form-group">
<form:label path="password">Last Name</form:label>
<form:input path="password" class="form-control"/>
<form:errors path="password" cssClass="error"/>
</div>

<input type="submit" value="Register" class="btn btn-primary"/>
</form:form>