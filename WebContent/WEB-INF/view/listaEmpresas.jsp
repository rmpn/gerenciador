<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List, br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet" />

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <c:import url="logout-parcial.jsp"/>
    	
	
	<c:if test="${not empty empresa}">
            Empresa ${empresa} cadastrada com sucesso!
    </c:if>

	<h2>Lista de Empresas</h2>
	<ul>

		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome}- <fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /> <a
				href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">editar</a>
				<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">remove</a>


			</li>
		</c:forEach>

	</ul>




</body>
</html>