<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<m:set var="x" value="12" />
	<m:if test="${x>=0}">
		<m:out value="Positive number......"></m:out>
	</m:if>
	<m:if test="${x<0}">
		<m:out value="Negative number......"></m:out>
	</m:if>
	
</body>
</html>