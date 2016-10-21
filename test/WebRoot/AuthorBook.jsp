<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
<head>
<title>图书列表</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<h2>该作者的图书有：</h2>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>图书编号</th>
				<th>名称</th>
				<th>作者编号</th>
				<th>出版社</th>
				<th>出版日期</th>
				<th>价格</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="bookList" var="b">
				<tr>
					<td>${b.isbn}</td>
					<td>${b.title}</td>
					<td>${b.authorId}</td>
					<td>${b.publisher}</td>
					<td>${b.publishDate}</td>
					<td>${b.price}</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<p>
		<a href="Home.jsp"><button type="button"
				class="btn btn-primary btn-lg btn-block">返回主页</button></a>
	</p>
</body>
</html>
