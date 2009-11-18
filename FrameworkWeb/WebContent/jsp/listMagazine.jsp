<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Magazine</title>
</head>
<body>
<h1>Magazine List</h1>

<!-- url : http://localhost:8080/FrameworkWeb/listMagazine.htm (.jsp 직접 호출하지 않음) -->

<ul>
	<c:forEach items="${model.magazineList}" var="magazine">
		<li>title = ${magazine.title}, price = ${magazine.price}</li>
	</c:forEach>
</ul>
<p>Total Count = ${model.count}</p>
</body>
</html>