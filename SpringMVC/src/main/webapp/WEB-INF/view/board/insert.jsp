<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head>
<body>
<h3>** 게시글 정보를 입력하시오 **</h3>
<form action="insertBoardProc.do"  method="post">
아이디 : <input type="text" name="user_id"><br>
이름 : <input type="text" name="user_name"><br>
제목 : <input type="text" name="subject"><br>
내용 : <input type="text" name="contents"><br>
<input type="submit" value="등록">
<input type="reset" value="재작성"><br>
</form>
</body>
</html>