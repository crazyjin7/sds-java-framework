<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="ch01.javabeans.UserBean"%>
    
<%
	/*
	UserBean user = new UserBean();
	user.setName("������");
	user.setAge(29);
	user.setMale(true);
	session.setAttribute("user", user);
	*/
	

%>

<jsp:useBean id="user" class="ch01.javabeans.UserBean" scope="session"/>
<jsp:setProperty name="user" property="name" value="������" />
<jsp:setProperty name="user" property="age" value="29" />
<jsp:setProperty name="user" property="male" value="true" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>����� ����</p>
	<p>
		�̸� : <%= user.getName() %><br/>
		���� : <%= user.getAge() %><br/>
		���� : <%= user.isMale() %><br/>
		�̸� : <jsp:getProperty name="user" property="name"/><br/>
		���� : <jsp:getProperty name="user" property="age"/><br/>
		���� : <jsp:getProperty name="user" property="male"/><br/>
	</p>
</body>
</html>