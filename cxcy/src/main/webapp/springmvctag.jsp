<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8
">
<title>Insert title here</title>
</head>
<body>
<form:form action="springtag" method="post" modelAttribute="user">
姓名:<form:input path="uname"/><br>
地址:<form:input path="uaddr.addr"/><br>
<input type="submit" value="提交">
</form:form>
</body>
</html>