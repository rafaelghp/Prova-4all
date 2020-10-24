package prova.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import prova.Core.DriverFactory;
import prova.page.carrinhoPage;
import prova.page.paginaInicialPage;

public class Desafio2 extends baseTeste{
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
	public void Desafio() throws InterruptedException {
		PaginaInicial.categoriaBebidas();
		PaginaInicial.adicionaCocacola();
		PaginaInicial.adicionaFantaUva();
		PaginaInicial.adicionaAguaSGas();
		PaginaInicial.todasCategorias();
		PaginaInicial.adicionaRisoles();
		PaginaInicial.carrinho();
		for (int i = 0;i<9;i++) {
		Carrinho.adicionaRisoles();
		}
		for(int i = 0;i<5;i++) {
		Carrinho.removeRisoles();
		}
		Assert.assertEquals("R$ 36,00",Carrinho.obtemPreço());
		Carrinho.finalizaCompra();
		Assert.assertEquals("Pedido realizado com sucesso!",Carrinho.mensagemSucesso());
		Carrinho.fechaMensagemCompra();
	}	
}
