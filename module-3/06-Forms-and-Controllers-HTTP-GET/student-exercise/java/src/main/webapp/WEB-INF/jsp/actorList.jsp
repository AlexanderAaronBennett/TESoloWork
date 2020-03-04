<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>
<%@include file = "common/header.jspf"% %>
<c:url var="formAction" value="/searchActor" />

<form method="GET" action="${formAction}">

<input type="text" name="search" id="name" />
<input class="formSubmitButton" type="submit" value="submit" />
</form>

<table class="table">

<tr>
<th>Name</th>
</tr>



<c:forEach var = "actor" items = "${actors}">
<tr>
<td> ${actor.firstName } ${actor.lastName}</td>
</tr>
</c:forEach>
</table>

<%@include file="common/footer.jspf"%>