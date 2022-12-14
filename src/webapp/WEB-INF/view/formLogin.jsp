<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkEntradaServlet}" method="POST">
		Login: <input type="text" name="login" value=""/><br/>
		Senha: <input type="password" name="senha" value=""/>
        <input type="hidden" name="acao" value="login" /> 
		<input type="submit"/>
	</form>
</body>
</html>