<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="s" uri="/struts-tags" %>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>添加作者</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<h2>请先输入作者信息</h2>
<body>
	<form action="AuthorAdd.action" class="form-horizontal" role="form">
	<div class="form-group">
			<label for="authorId" class="col-sm-2 control-label">作者编号</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="authorId"
					placeholder="请输入作者编号">
			</div>
		</div>
			<div class="form-group">
			<label for="name" class="col-sm-2 control-label">姓名</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="name"
					placeholder="请输入作者姓名">
			</div>
		</div>
					<div class="form-group">
			<label for="age" class="col-sm-2 control-label">年龄</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="age"
					placeholder="请输入作者年龄">
			</div>
		</div>
		<div class="form-group">
			<label for="country" class="col-sm-2 control-label">国籍</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="country"
					placeholder="请输入作者国籍">
			</div>
		</div>
		<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">提交</button>
		</div>
	</div>
  </form>
	<p>
		<a href="Home.jsp"><button type="button"
				class="btn btn-primary btn-lg btn-block">返回主页</button></a>
	</p>
</body>
</html>
