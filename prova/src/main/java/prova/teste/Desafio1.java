package prova.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import prova.Core.DriverFactory;
import prova.page.carrinhoPage;
import prova.page.paginaInicialPage;


public class Desafio1 extends baseTeste{
	private paginaInicialPage PaginaInicial;
	private carrinhoPage Carrinho;
	@Before
	public void inicializa() {
		System.setProperty("webdriver.gecko.driver", "C:\\DRIVERS\\geckodriver.exe");
		DriverFactory.getDriver().get("https://shopcart-challenge.4all.com");
		PaginaInicial = new paginaInicialPage(DriverFactory.getDriver());
		Carrinho = new carrinhoPage(DriverFactory.getDriver());
	}
	
	@Test
	public void teste() {
		PaginaInicial.categoriaDoces();
		PaginaInicial.adicionaAlfajor();
		PaginaInicial.adicionaBrigadeiro();
		PaginaInicial.todasCategorias();
		PaginaInicial.carrinho();
		for (int i=0;i<4;i++) {
			Carrinho.adicionaBrigadeiro();
		}
		Carrinho.finalizaCompra();
		Assert.assertEquals("Pedido realizado com sucesso!",Carrinho.mensagemSucesso());
		Carrinho.fechaMensagemCompra();
	}
	
}
