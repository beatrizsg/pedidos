<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Pedido" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar</title>
</head>
<body>

	<%Pedido pedido = (Pedido)request.getAttribute("cadastra"); %>
	Cadastro realizado: <%=pedido.getNumeroPedido() %><br />
	
	<a href="index.html">VOLTAR</a>
	
</body>
</html>