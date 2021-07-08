<%@page import="com.ict.db.VO"%>
<%@page import="java.util.List"%>
<%@page import="com.ict.db.DAO"%>
<%@page
	import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("utf-8");
	String search = request.getParameter("search");
	String keyword = request.getParameter("keyword");

	WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
	DAO dao = (DAO) context.getBean("dao");
	List<VO> list = dao.getDynamic(search, keyword);
	pageContext.setAttribute("list", list);
	pageContext.setAttribute("search", search);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<c:choose>
			<c:when test="${search==1}">번호로 찾은 결과</c:when>
			<c:when test="${search==2}">아이디로 찾은 결과</c:when>
			<c:when test="${search==3}">이름으로 찾은 결과</c:when>
			<c:when test="${search==4}">나이로 찾은 결과</c:when>
		</c:choose>
	</h2>
	<h2>
		<c:choose>
			<c:when test="${empty list}">
				<li>원하는 자료가 존재하지 않습니다.</li>
			</c:when>
			<c:otherwise>
				<c:forEach var="k" items="${list}">
					<li>${k.idx} &nbsp;&nbsp; ${k.id} &nbsp;&nbsp; ${k.pw}
						&nbsp;&nbsp; ${k.name} &nbsp;&nbsp; ${k.age} &nbsp;&nbsp;
						${k.addr} &nbsp;&nbsp; ${k.reg.substring(0,10)} &nbsp;&nbsp;</li>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</h2>
</body>
</html>