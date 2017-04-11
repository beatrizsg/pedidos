import model.Pedido;
import service.PedidoService;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		Pedido result = new Pedido();
		String oQueFazer = request.getParameter("oQueFazer");
		
		switch (oQueFazer){
		case "Cadastrar": 
			ps.criar(pedido);
			request.setAttribute("cadastra", pedido);
			RequestDispatcher view = request.getRequestDispatcher("Cadastrar.jsp");
			view.forward(request, response);
		break;
		case "Consultar": 
			result = ps.carregar(pedido.getNumeroPedido());
			request.setAttribute("consulta", result);
			RequestDispatcher view1 = request.getRequestDispatcher("Consulta.jsp");
			view1.forward(request, response);
		break;
		case "Remover": 
			ps.excluir(pedido.getNumeroPedido());
			request.setAttribute("remove", pedido);
			RequestDispatcher view2 = request.getRequestDispatcher("Remover.jsp");
			view2.forward(request, response);
		break;
		case "Atualizar": 
			ps.atualizar(pedido);
			request.setAttribute("atualiza", pedido);
			RequestDispatcher view3 = request.getRequestDispatcher("Atualiza.jsp");
			view3.forward(request, response);
		break;
		}
		
		
	}

}
