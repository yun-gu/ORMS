<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>user</th>
			<th>method</th>
			<th>operation</th>
			<th>purpose</th>
			<th>conditions</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${requirementsList}" var="item">
			<tr>
				<td>${item.user}</td>
				<td>${item.method}</td>
				<td>${item.operation}</td>
				<td>${item.purpose}</td>
				<td>${item.conditions}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>


</body>
</html>