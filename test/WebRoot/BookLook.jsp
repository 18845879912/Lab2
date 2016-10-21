<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>图书一览</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
</head>

<body>
	<div class="container">
		<h2>收录图书有：</h2>
		<table class="table table-striped">

			<tr>
				<td>图书编号</td>
				<td>书名</td>
				<td>修改</td>
				<td>删除</td>

			</tr>
			<s:iterator value="bookList1" var="b">
				<tr>
					<td>${b.isbn}</td>
					<td><a
						href="BookDetail.action?authorId=${b.authorId}&isbn=${b.isbn}">${b.title}</a></td>
					<td><a
						href="BookDetail2.action?authorId=${b.authorId}&isbn=${b.isbn}">
							<span class="glyphicon glyphicon-pencil"></span>
					</a></td>

					<td><a
						href="BookDelete.action?authorId=${b.authorId}&isbn=${b.isbn}">
							<span class="glyphicon glyphicon-trash"></span>
					</a></td>
			</s:iterator>
		</table>
	</div>


	<p>
		<a href="Home.jsp"><button type="button"
				class="btn btn-primary btn-lg btn-block">返回主页</button></a>
	</p>
	<script
		src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>

