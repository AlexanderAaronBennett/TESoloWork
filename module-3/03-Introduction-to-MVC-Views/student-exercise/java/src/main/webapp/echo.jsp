<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="Echo"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="routeCount" value="10" />
		<c:set var="routeWord" value="Echo" />
		<c:url var="echoRoute" value="echo.jsp">
			<c:param value="${ routeCount }" name="count" />
			<c:param value="${ routeWord }" name="word" />
		</c:url>
		<li>
			<a href="<c:out value="${ echoRoute }" />">${ routeWord } ${ routeCount }</a>
		</li>

		<c:set var="routeCount" value="20" />
		<c:set var="routeWord" value="Hello!" />
		<c:url var="echoRoute" value="echo.jsp">
			<c:param value="${ routeCount }" name="count" />
			<c:param value="${ routeWord }" name="word" />
		</c:url>
		<li>
			<a href="<c:out value="${ echoRoute }" />">${ routeWord } ${ routeCount }</a>
		</li>

		<c:set var="routeCount" value="50" />
		<c:set var="routeWord" value="Goodbye!" />
		<c:url var="echoRoute" value="echo.jsp">
			<c:param value="${ routeCount }" name="count" />
			<c:param value="${ routeWord }" name="word" />
		</c:url>
		<li>
			<a href="<c:out value="${ echoRoute }" />">${ routeWord } ${ routeCount }</a>
		</li>
	</ul>
</nav>
<ul>
<c:set var="pxcount" value ="${param.count}"/>
<c:set var= "pxcount2" value = "${pxcount}"/>
	<c:forEach begin= "1" end= "${param.count}" var = "number">
	<li style="font-size: ${pxcount2}px;"> "${param.word}"</li>
	<c:set var= "pxcount2" value = "${pxcount2 - 1 }"/>
	</c:forEach>
</ul>
<c:import url="common/footer.jsp"></c:import>