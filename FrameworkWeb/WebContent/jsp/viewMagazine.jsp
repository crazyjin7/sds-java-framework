<%@ page contentType="text/html; charset=euc-kr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<title>Magazine</title>
</head>
<body>
<h1>Magazine Insert</h1>

<!-- 도메인 객체 사용 -->
<spring:nestedPath path="Magazine">
	<form method="post">

	<table>

		<tr>
			<td>Magazine Title</td>
			<td>
				<spring:bind path="title">
					<input type="text" name="${status.expression}" value="${status.value}" />
				</spring:bind>
			</td>
		</tr>

		<tr>
			<td>Magazine Price</td>
			<td>
				<spring:bind path="price">
					<c:forEach items="${status.errorMessages}" var="errMsg">
						<font color="red"><c:out value="${errMsg}" /></font><br/>
					</c:forEach>
					<input type="text" name="${status.expression}" value="${status.value}" />
				</spring:bind>
			</td>
		</tr>

		<tr>
			<td>Magazine Created</td>
			<td>
				<spring:bind path="created">
					<c:forEach items="${status.errorMessages}" var="errMsg">
						<font color="red"><c:out value="${errMsg}" /></font><br/>
					</c:forEach>
					<input type="text" name="${status.expression}" value="${status.value}" />
				</spring:bind>
			</td>
		</tr>

		<tr>
			<td />
			<td><input type="submit" value="Save" /></td>
		</tr>
	</table>

	</form>
</spring:nestedPath>

</body>
</html>
