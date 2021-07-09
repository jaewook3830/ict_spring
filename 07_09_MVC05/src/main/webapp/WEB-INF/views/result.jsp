<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 결과보기 </h2>
	<c:choose>
		<c:when test="${mvo.op =='/'}">
			<h3> ${mvo.s1} ${mvo.op} ${mvo.s2} = ${result2 }</h3>
		</c:when>
		<c:otherwise>
			<h3> ${mvo.s1} ${mvo.op} ${mvo.s2} = ${result }</h3>
		</c:otherwise>
	</c:choose>
	<hr>
	<c:forEach var="k" items="${mvo.hobby }">
			<h3><li>${k }</li></h3>
	</c:forEach>
	<hr>
	<h2> meberNo : ${mvo.meberNo}</h2>
	
	
</body>
</html>