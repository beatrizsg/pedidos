<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="model.Pedido" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Dados atualizados:<br /><br />
	Número da mesa: ${atualiza.numeroMesa} <br />
	Prioridade: ${atualiza.prioridade}<br />
	Quantidade: ${atualiza.quantidade}<br />
	Valor Total: ${atualiza.valorTotal}<br />
	Garçom: ${atualiza.garcom}<br />
	CPF: ${atualiza.cpf}<br />
	Data: ${atualiza.dataHora}<br />
	Status: ${atualiza.status}<br />
	
	<a href="index.jsp">VOLTAR</a>

</body>
</html>