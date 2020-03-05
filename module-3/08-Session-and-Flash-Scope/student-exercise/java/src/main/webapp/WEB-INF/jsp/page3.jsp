<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Season" />
</c:import>

<form method="POST">
	<label>What is your favorite Season?</label>
	<div>
<input type="radio" id="Winter" name="season" value="Winter">
<label for="Winter">Winter</label><br>
<input type="radio" id="Spring" name="season" value="Spring">
<label for="Spring">Spring</label><br>
<input type="radio" id="Summer" name="season" value="Summer">
<label for="Summer">Summer</label><br>
<input type="radio" id="Fall" name="season" value="Fall">
<label for="Fall">Fall</label>
<br>
	<button type="submit">Next >>></button>
	</div>
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />