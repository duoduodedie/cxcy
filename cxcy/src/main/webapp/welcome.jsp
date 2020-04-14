<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ taglib prefix="springmvc" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8
">
<title>Insert title here</title>
</head>
<body>
<%-- <springmvc:message code="welcome" arguments="${requestScope.u1.uname}"/> --%>
<springmvc:message code="welcome" />${requestScope.u1.uname}
<br>你的地址是:${requestScope.u1.uaddr.addr}<br>
爱好：<br>
${requestScope.u1.hobbies[0]}<br>
${requestScope.u1.hobbies[1]}
</body>
</html>