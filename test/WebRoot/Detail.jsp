<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>

<title>图书信息</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<h2>该书的详细信息：</h2>
	<table class="table table-striped">
		<tr>
			<th>图书编号</th>
			<th>名称</th>
			<th>出版社</th>
			<th>出版日期</th>
			<th>价格</th>
		</tr>
		<tr>
			<td>${r1.isbn}</td>
			<td>${r1.title}</td>
			<td>${r1.publisher}</td>
			<td>${r1.publishDate}</td>
			<td>${r1.price}</td>
		</tr>
	</table>
	<table class="table table-striped">
		<tr>
			<th>作者编号</th>
			<th>作者姓名</th>
			<th>年龄</th>
			<th>国籍</th>
		</tr>
		<tr>
			<td>${r2.authorId}</td>
			<td>${r2.name}</td>
			<td>${r2.age}</td>
			<td>${r2.country}</td>
		</tr>
	</table>
	<form action="BookSee.action">
		<input type="submit" value="返回">
	</form>
	<p>
		<a href="Home.jsp"><button type="button"
				class="btn btn-primary btn-lg btn-block">返回主页</button></a>
	</p>
</body>
</html>
