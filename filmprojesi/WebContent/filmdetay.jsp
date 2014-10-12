<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp" />

<h3><u> ${film.ad}</u></h3>
<table style="border: 1px solid; border-color: gray;">		
	<tr>
		<td>Senesi:</td>
		<td>${film.sene }</td>
	</tr>
	<tr>
		<td>Yönetmeni:</td>
		<td>${film.yonetmen.ad} &nbsp;${film.yonetmen.soyad}&nbsp;,${film.yonetmen.yas}</td>
	</tr>
	<tr>
		<td>Kategori:</td>
		<td>${film.kategori.ad }</td>
	</tr>
</table>
<br>
<br>
<a href="favori?filmid=${film.id}">Favori olarak ekle</a>

<jsp:include page="footer.jsp"></jsp:include>