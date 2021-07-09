<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="calc.do">
		<p>수 1 : <input type="number" name="s1"></p>
		<p>수 2 : <input type="number" name="s2"></p>
		<p>연산자 :
			<input type="radio" name="op" value="+"> +
			<input type="radio" name="op" value="-"> -
			<input type="radio" name="op" value="*"> *
			<input type="radio" name="op" value="/"> /
		</p>
		<p>취미 :
			<input type="checkbox" name="hobby" value="축구"> 축구 
			<input type="checkbox" name="hobby" value="야구"> 야구 
			<input type="checkbox" name="hobby" value="배구"> 배구 
			<input type="checkbox" name="hobby" value="농구"> 농구 
		</p>
		<input type="hidden" name="meberNo" value="asd123">
		<input type="submit" value="보내기">
	</form>
</body>
</html>