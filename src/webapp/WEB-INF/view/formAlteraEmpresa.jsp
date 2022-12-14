<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
    <c:url value="/entrada" var="linkServletEntrada"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="logout-parcial.jsp"/>
	<form action="${linkServletEntrada}" method="POST">
		Nome: <input type="text" name="nome" value="${empresa.nome}"/><br/>
		
		Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"/><br/>
		<input type="hidden" name="id" value="${empresa.id }"/>
		<input type="hidden" name="acao" value="AlteraEmpresa"/>		
		<input type="submit"/>
	</form>

</body>
</html>