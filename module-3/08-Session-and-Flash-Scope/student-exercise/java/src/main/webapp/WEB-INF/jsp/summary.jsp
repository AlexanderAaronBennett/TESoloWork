<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="summary" />
</c:import>
<table>
<tr><td>Favorite Color: ${favoriteColor}</td></tr>
<tr><td>Favorite Food: ${favoriteFood}</td></tr>
<tr><td>Favorite Season: ${season}</td></tr>

</table>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />