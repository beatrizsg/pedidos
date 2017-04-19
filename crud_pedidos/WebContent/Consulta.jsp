<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.Pedido" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta</title>
</head>
<body>
	<%Pedido pedido = (Pedido)request.getAttribute("consulta"); %>
	Número da mesa: ${consulta.numeroMesa} <br />
	Prioridade: ${consulta.prioridade}<br />
	Quantidade: ${consulta.quantidade}<br />
	Valor Total: ${consulta.valorTotal}<br />
	Garçom: ${consulta.garcom}<br />
	CPF: ${consulta.cpf}<br />
	Data: ${consulta.dataHora}<br />
	Status: ${consulta.status}<br />
	
	<a href="index.jsp">VOLTAR</a>
</body>
</html>