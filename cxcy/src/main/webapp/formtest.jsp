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
<form action="form/doform" method="post">
	姓名：<input type="text" name="uname"><br>
	地址：<input type="text" name="uaddr.addr"><br>
	电话：<input type="text" name="uaddr.num"><br>
	爱好：<br>
	<input type="checkbox" name="hobbies" value="篮球">篮球&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="checkbox" name="hobbies" value="足球">足球&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="checkbox" name="hobbies" value="排球">排球&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="checkbox" name="hobbies" value="冰球">冰球&nbsp;&nbsp;&nbsp;&nbsp;<br>
	<input type="submit" value="submit">
</form>
</body>
</html>