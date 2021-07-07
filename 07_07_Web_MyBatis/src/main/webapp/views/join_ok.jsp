<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="com.ict.db.DAO"%>
<%@page import="com.ict.db.VO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	VO vo = new VO();
	vo.setId(request.getParameter("id"));
	vo.setPw(request.getParameter("pw"));
	vo.setName(request.getParameter("name"));
	vo.setAge(request.getParameter("age"));
	vo.setAddr(request.getParameter("addr"));

	WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
	DAO dao = (DAO)context.getBean("dao");
	int result = dao.getInsert(vo); 
	if(result > 0) {
		response.sendRedirect("index.jsp");
	}
%>