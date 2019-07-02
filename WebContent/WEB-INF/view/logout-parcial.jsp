<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


   
	<c:if test= "${not empty usuarioLogado.login}">
	
	       <a href="entrada?acao=Logout"> Logout </a>
	       <br>
           Usuario Logado: ${usuarioLogado.login}
           <br>
           <br>
           <br>
    </c:if>
	
	


</body>
</html>