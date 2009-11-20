<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ch01.javabeans.UserBean" %>
    
<%
//	UserBean user = (UserBean)session.getAttribute("user");
//	if(user == null){
//		user = new UserBean();
//		session.setAttribute("user", user);
//	}

//	user.setName("정길용");
//	user.setAge(29);
//	user.setMale(true);
	
%>    

<jsp:useBean id="user" class="ch01.javabeans.UserBean" scope="session" />
<jsp:setProperty name="user" property="name" value="정길용" />
<jsp:setProperty name="user" property="age" value="29" />
<jsp:setProperty name="user" property="male" value="true" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>사용자 정보</p>
	<p>
		이름 : <jsp:getProperty name="user" property="name" /> <br/>
		나이 : <jsp:getProperty name="user" property="age" /> <br/>
		남성 : <jsp:getProperty name="user" property="male" /> <br/>	
	</p>
</body>
</html>















