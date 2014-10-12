<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="../style.css" type="text/css">


<jsp:include page="../header.jsp" />

<h3>Film Bilgilerini Girin</h3>
<form method="post" action="filmekle">
	<table>
<tr><td> Film Adı: </td><td><input type="text" name="filmadi"></td>


</tr>
</table>
	</form>
	<jsp:include page="../footer.jsp"></jsp:include>