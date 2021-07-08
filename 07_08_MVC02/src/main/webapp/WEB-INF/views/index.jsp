<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>첫번째 Spring MVC 어노테이션 예제</h2>
	<form action="hello.do" method="get">
		<input type="submit" value="hello(get)">
	</form>
	<hr>
	
	<form action="hello.do" method="post">
		<input type="submit" value="hello(post)">
	</form>
	<hr>
	<h2><a href="hi.do">Hi</a></h2>
</body>
</html>