<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List, br.com.alura.gerenciador.modelo.Empresa"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	

	<h2>Lista de Empresas</h2>
	<ul>
		<%
			List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas");
			for (Empresa empresa : empresas) {
		%>

		<li><%=empresa.getNome()%></li>
		<%
			}
		%>
	</ul>


</body>
</html>