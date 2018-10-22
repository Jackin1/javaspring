<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>** 게시판 **</h2>
<hr>
<table>
	<c:if test="${!empty list}">
		<c:forEach items="${list }" var="board">
			<tr>
				<td>${customer.id }</td>
				<td>${customer.password }</td>
				<td>${customer.name }</td>
			</tr>
		</c:forEach>
	</c:if>
</table>
<a href="">홈화면으로 이동</a><br>
</body>
</html>