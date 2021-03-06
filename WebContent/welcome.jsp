<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="succPage" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<script type='text/javascript' src="./js/tingyun-rum.js"></script>
<script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#addHtml").click(function(){
			$.get("${ctx}/list.action", function(data, status){
				alert("data: "+data);
			});
		});
	});
	
</script>
</head>
<body>
	<button type="button" id="addHtml">增加</button>
	<p></p>
	<br>
	<s:text name="succTip">
		<s:param>${sessionScope.user}</s:param>
	</s:text>
	<br />
	<table border="1">
		<tr>
			<th>id</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th>操作</th>
		</tr>
		<s:iterator value="persons" id="person">
			<tr>
				<td>${person.id}</td>
				<td>${person.name}</td>
				<td>${person.age}</td>
				<td>${person.sex}</td>
				<td><a href="#">更新</a> <a
					href="${ctx}/delete.action?id=${person.id} ">删除</a></td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>