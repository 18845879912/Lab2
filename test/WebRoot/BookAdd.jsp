<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加图书信息</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>
	<form action="Judge.action" class="form-horizontal" role="form">
		<div class="form-group">
			<label for="isbn" class="col-sm-2 control-label">图书编号</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="isbn"
					placeholder="请输入图书编号">
			</div>
		</div>
		<div class="form-group">
			<label for="title" class="col-sm-2 control-label">名称</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="title"
					placeholder="请输入图书名称">
			</div>
		</div>
		<div class="form-group">
			<label for="authorId" class="col-sm-2 control-label">作者编号</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="authorId"
					placeholder="请输入作者编号">
			</div>
		</div>
		<div class="form-group">
			<label for="publisher" class="col-sm-2 control-label">出版社</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="publisher"
					placeholder="请输入出版社">
			</div>
		</div>
		<div class="form-group">
			<label for="publishDate" class="col-sm-2 control-label">出版日期</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="publishDate"
					placeholder="请输入出版日期">
			</div>
		</div>
		<div class="form-group">
			<label for="price" class="col-sm-2 control-label">价格</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="price"
					placeholder="请输入价格">
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">提交</button>
			</div>
		</div>
	</form>
	<p>
	<a href="Home.jsp"><button type="button" class="btn btn-primary btn-lg btn-block">返回主页</button></a>
</p>
</body>
</html>
