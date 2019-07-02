<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List, br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet"/>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:import url="logout-parcial.jsp"/>

	
<form action="${linkEntradaServlet}"  method="post">
    
    Código: <input type ="text" name="id" value="${empresa.id}" hidden="false"/>
     <input type="hidden" name="acao" value="AlteraEmpresa"/>
    Nome: <input type="text" name="nome" value="${empresa.nome}"/>
    Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" />
    
    <input type="submit"/>

</form>	

 


</body>
</html>