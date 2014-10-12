<%@page import="ogg.entity.Kategori"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ogg.dao.KategoriDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	ArrayList<Kategori> kategoriler = new KategoriDao().GetirKategori();
	request.setAttribute("kategoriler", kategoriler);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Film Sitesi</title>
<link rel="stylesheet" href="style.css" type="text/css" />
</head>
<body>
	<div id="main">
		<div id="header">
			<img src="images/saulogo.png"
				style="position: absolute; top: 1px; left: 750px;">
			<h1>FİLM SİTESİ</h1>

		</div>
		<a href="home">Anasayfa</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="hakkimizda.jsp">Hakkımızda</a>&nbsp;&nbsp;&nbsp;&nbsp;

		<c:if test="${empty kullanici }">
			<a href="uyegiris.jsp">Üye Girişi</a>&nbsp;&nbsp;&nbsp;&nbsp;
    </c:if>
		<c:if test="${not empty kullanici }">
		<a href="guvenli/filmekle.jsp">Film Ekle</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="cikis">Üye Çıkışı</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<span style="text-align: right;">Merhaba, ${kullanici }</span>
		</c:if>
		<div id="contentmain">

			<div id="menu">
				<h4>Kategoriler</h4>
				<br>

				<c:forEach items="${kategoriler}" var="kategori">
					<a href="filmler?kategoriid=${kategori.id }">${kategori.ad }</a>
					<br>
				</c:forEach>
				<br>
				<hr>
				<c:if test="${favoriler.isEmpty() eq false}">
					<h4>Favoriler</h4>
					<c:forEach items="${favoriler}" var="film">
						<a href="filmdetay?filmid=${film.key}">${film.value }</a>
						<br>
					</c:forEach>

				</c:if>

			</div>
			<div id="content">