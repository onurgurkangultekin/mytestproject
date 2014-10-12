<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp" />

<form method="post" action="giris">
	<table>

		<tr>
			<td>Kullanıcı Adı:</td>
			<td><input type="text" name="kullaniciadi"
				placeholder="kullanıcı adı girin"></td>
		</tr>
		<tr>
			<td>Şifre:</td>
			<td><input type="password" name="sifre"
				placeholder="şifre girin"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Giriş Yap">
			</td>
		</tr>
	</table>
	<c:if test="${not empty mesaj}">
		<p style="color: red;">${mesaj }</p>
	</c:if>
</form>
<jsp:include page="footer.jsp"></jsp:include>