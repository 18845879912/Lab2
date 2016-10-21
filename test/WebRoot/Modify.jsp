<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>

<title>信息更改</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>

<body>
	<h2>请完成您的修改</h2>

	<form action="BookModify.action">
		<s:form>
			<s:textfield name="r1.isbn" label="图书编号" value="%{r1.isbn}"
				required="true" requiredposition="left" readonly="true"></s:textfield>
			<br>
			<s:textfield name="r1.title" label="名称" value="%{r1.title}"
				required="true" requiredposition="left" readonly="true"></s:textfield>
			<br>
			<s:textfield name="r1.publisher" label="出版社" value="%{r1.publisher}"
				required="true" requiredposition="left"></s:textfield>
			<br>
			<s:textfield name="r1.publishDate" label="出版日期"
				value="%{r1.publishDate}" required="true" requiredposition="left"></s:textfield>
			<br>
			<s:textfield name="r1.price" label="价格" value="%{r1.price}"
				required="true" requiredposition="left"></s:textfield>
			<br>
			<s:textfield name="r1.authorId" label="作者编号" value="%{r1.authorId}"
				required="true" requiredposition="left"></s:textfield>
			<br>
			<input type="submit" value="提交">
		</s:form>
	</form>
	<p>
		<a href="Home.jsp"><button type="button"
				class="btn btn-primary btn-lg btn-block">返回主页</button></a>
	</p>
</body>
</html>
