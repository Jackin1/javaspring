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
				<td>${board.board_id }</td>
				<td>${board.subject }</td>
				<td>${board.user_id }</td>
			</tr>
		</c:forEach>
	</c:if>
</table>
<a href="index.jsp">홈화면으로 이동</a><br><a href="insertBoard.do">새 글쓰기</a>
</body>
</html>