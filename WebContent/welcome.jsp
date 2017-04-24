<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="succPage" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
</head>
<body>
	<s:text name="succTip">
		<s:param>${sessionScope.user}</s:param>
	</s:text>
	<br />
	<table border="1">
		<tr>
			<th>id</th>
			<th>����</th>
			<th>����</th>
			<th>�Ա�</th>
			<th>����</th>
		</tr>
		<s:iterator value="persons" id="person">
			<tr>
				<td>${person.id}</td>
				<td>${person.name}</td>
				<td>${person.age}</td>
				<td>${person.sex}</td>
				<td><a href="#">����</a> <a
					href="${ctx}/delete.action?id=${person.id} ">ɾ��</a></td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>