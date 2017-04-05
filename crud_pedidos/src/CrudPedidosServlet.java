import model.Pedido;
import service.PedidoService;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrudPedidosServlet
 */
@WebServlet("/crudPedidos")
public class CrudPedidosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrudPedidosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numeroDaMesa = Integer.parseInt(request.getParameter("idMesa"));
		int numeroPedido = Integer.parseInt(request.getParameter("numeroPedido"));
		String status = request.getParameter("status");
		int prioridade = Integer.parseInt(request.getParameter("prioridade"));
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
		double valorTotal = Double.parseDouble(request.getParameter("idMesa"));
		String garcom = request.getParameter("garcom");
		String cpf = request.getParameter("cpf");
		String dataHora = request.getParameter("data");
		
		Pedido pedido = new Pedido(numeroDaMesa,numeroPedido,status,prioridade,
									quantidade,valorTotal,garcom,cpf,dataHora);
		
		PedidoService ps = new PedidoService();
		Pedido result= new Pedido();
		PrintWriter out = response.getWriter();
		String oQueFazer = request.getParameter("oQueFazer");
		
		switch (oQueFazer){
		case "Cadastrar": 
			ps.criar(pedido);
			out.println("<html><head><title>Cliente Cadastrado</title></head><body>");
			out.println( "Cadastro realizado: " + pedido.getNumeroPedido());
			out.println("</body></html>");
		break;
		case "Consultar": 
			result = ps.carregar(pedido.getNumeroPedido());
			out.println("<html><head><title>Cliente Cadastrado</title></head><body>");
			out.println( "Número da mesa: "+result.getNumeroMesa()+"<br>");
			out.println( "Número do pedido: "+result.getNumeroPedido()+"<br>");
			out.println( "Prioridade: "+result.getPrioridade()+"<br>");
			out.println( "Quantidade: "+result.getQuantidade()+"<br>");
			out.println( "Valor Total: "+result.getValorTotal()+"<br>");
			out.println( "Garçom: "+result.getGarcom()+"<br>");
			out.println( "CPF: "+result.getCpf()+"<br>");
			out.println( "Data: "+result.getDataHora()+"<br>");
			out.println( "Status"+result.getStatus()+"<br>");
		break;
		case "Remover": 
			ps.excluir(pedido.getNumeroPedido());
			out.println("<html><head><title>Cliente Cadastrado</title></head><body>");
			out.println( "Pedido " + pedido.getNumeroPedido() + " removido com sucesso");
			out.println("</body></html>");
		break;
		case "Atualizar": 
			ps.atualizar(pedido);
			out.println("<html><head><title>Cliente Cadastrado</title></head><body>");
			out.println( "Número da mesa: "+pedido.getNumeroMesa()+"<br>");
			out.println( "Número do pedido: "+pedido.getNumeroPedido()+"<br>");
			out.println( "Prioridade: "+pedido.getPrioridade()+"<br>");
			out.println( "Quantidade: "+pedido.getQuantidade()+"<br>");
			out.println( "Valor Total: "+pedido.getValorTotal()+"<br>");
			out.println( "Garçom: "+pedido.getGarcom()+"<br>");
			out.println( "CPF: "+pedido.getCpf()+"<br>");
			out.println( "Data: "+pedido.getDataHora()+"<br>");
			out.println( "Status"+pedido.getStatus()+"<br>");
		break;
		}
		
		
	}

}
