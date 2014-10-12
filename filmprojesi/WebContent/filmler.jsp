<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp" />

FİLMLER
<br>
<hr>
<c:forEach items="${filmler}" var="film">
	<a href="filmdetay?filmid=${film.id }">${film.ad }</a>
	<br>
</c:forEach>

<jsp:include page="footer.jsp"></jsp:include>