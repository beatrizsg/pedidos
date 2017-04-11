//package test;
//
//
//import static org.junit.Assert.assertEquals;
//import model.Pedido;
//
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import service.PedidoService;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class ClienteTest {
//	Pedido pedido, copia;
//	PedidoService pedidoService;
//	static int id = 0;
//
//	/*
//	 * Antes de rodar este teste, certifique-se que nao ha no banco nenhuma
//	 * linha com o id igual ao do escolhido para o to instanciado abaixo. Se
//	 * houver, delete. 
//	 * Certifique-se também que sobrecarregou o equals na classe
//	 * Cliente. 
//	 * Certifique-se que a fixture cliente1 foi criada no banco.
//	 * Além disso, a ordem de execução dos testes é importante; por
//	 * isso a anotação FixMethodOrder logo acima do nome desta classe
//	 */
//	@Before
//	public void setUp() throws Exception {
//		System.out.println("setup");
//		pedido = new Pedido();
//		pedido.setCpf("");
//		pedido.setDataHora();
//		pedido.setGarcom(garcom);
//		pedido.setNumeroMesa();
//		pedido.setNumeroPedido(numeroPedido);
//		pedido.setPrioridade(prioridade);
//		pedido.setQuantidade(quantidade);
//		pedido.setStatus(status);
//		pedido.setValorTotal(valorTotal);
//		copia = new Pedido();
//		copia.setCpf("");
//		copia.setDataHora();
//		copia.setGarcom(garcom);
//		copia.setNumeroMesa();
//		copia.setNumeroPedido(numeroPedido);
//		copia.setPrioridade(prioridade);
//		copia.setQuantidade(quantidade);
//		copia.setStatus(status);
//		copia.setValorTotal(valorTotal);
//		pedidoService = new PedidoService();
//		System.out.println(pedido);
//		System.out.println(copia);
//		System.out.println(id);
//	}
//	
//	@Test
//	public void test00Carregar() {
//		System.out.println("carregar");
//		//para funcionar o cliente 1 deve ter sido carregado no banco por fora
//		Pedido fixture = new Pedido();
//		fixture.setId(1);
//		fixture.setNome("Carlos Drummond de Andrade");
//		fixture.setFone("(11) 91234-4321");
//		fixture.setEmail("cda@usjt.br");
//		PedidoService novoService = new PedidoService();
//		Pedido novo = novoService.carregar(1);
//		assertEquals("testa inclusao", novo, fixture);
//	}
//
//	@Test
//	public void test01Criar() {
//		System.out.println("criar");
//		id = pedidoService.criar(pedido);
//		System.out.println(id);
//		copia.setId(id);
//		assertEquals("testa criacao", pedido, copia);
//	}
//
//	@Test
//	public void test02Atualizar() {
//		System.out.println("atualizar");
//		pedido.setFone("999999");
//		copia.setFone("999999");		
//		pedidoService.atualizar(pedido);
//		pedido = pedidoService.carregar(pedido.getId());
//		assertEquals("testa atualizacao", pedido, copia);
//	}
//
//	@Test
//	public void test03Excluir() {
//		System.out.println("excluir");
//		copia.setId(-1);
//		copia.setNome(null);
//		copia.setFone(null);
//		copia.setEmail(null);
//		pedidoService.excluir(id);
//		pedido = pedidoService.carregar(id);
//		assertEquals("testa exclusao", pedido, copia);
//	}
//}