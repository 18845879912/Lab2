<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="s" uri="/struts-tags" %>  

<html>
  <head>
    
    <title>图书馆在线管理系统</title>
    	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  
  <body>
   <h1>欢迎使用在线图书管理系统！</h1>
  <p>
  <a href="BookAdd.jsp"><button type="button" class="btn btn-primary btn-lg btn-block">添加图书</button></a>
  <a href="AuthorFind.jsp"><button type="button" class="btn btn-primary btn-lg btn-block">作者查询</button></a>
  <a href="BookSee.action"><button type="button" class="btn btn-primary btn-lg btn-block">图书一览</button></a>
  </p>
  </body>
  
</html>
