<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRUD de Pedidos básico</title>
</head>
<body>
	<form method="post" action="crudPedidos">
		<label for="numero_mesa">Número da mesa:</label> 
		<input type="text" placeholder="Digite o número da mesa" id="numero_mesa" name="idMesa" /><br />
		
		<label for="numero_pedido">Número do pedido:</label> 
		<input type="text" placeholder="Digite o numero do pedido" id="numero_pedido" name="numeroPedido" /><br /> 
		
		<label for="prioridade">Prioridade:</label>
		<input type="text" placeholder="Digite a prioridade" id="prioridade" name="prioridade" /><br /> 
		
		<label for="prioridade">Quantidade:</label>
		<input type="text" placeholder="Digite a quantidade" id="quantidade" name="quantidade" /><br /> 
		
		<label for="prioridade">Valor Total:</label>
		<input type="text" placeholder="Digite o valor total" id="valor_total" name="valorTotal" /><br /> 
		
		<label for="prioridade">Garçom:</label>
		<input type="text" placeholder="Digite o garçom" id="garcom" name="garcom" /><br /> 
		
		<label for="prioridade">CPF:</label>
		<input type="text" placeholder="Digite o CPF" id="cpf" name="cpf" /><br /> 
		
		<label for="prioridade">Data:</label>
		<input type="text" placeholder="Digite o data" id="data" name="data" /><br /> 
		
		<label for="prioridade">Status:</label>
		<input type="text" placeholder="Digite o status" id="status" name="status" /><br /> 
		
		<input type="submit" name="oQueFazer" value="Cadastrar" /><br /> 
		<input type="submit" name="oQueFazer" value="Consultar" /><br /> 
		<input type="submit" name="oQueFazer" value="Remover" /><br /> 
		<input type="submit" name="oQueFazer" value="Atualizar" />
	</form>
</body>
</html>