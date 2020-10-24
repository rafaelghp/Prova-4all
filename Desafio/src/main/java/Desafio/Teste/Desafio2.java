package Desafio.Teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Desafio.Page.carrinhoPage;
import Desafio.Page.homePage;
import Desafio.core.DriverFactory;



public class Desafio2 extends BaseTeste{
	private homePage home;
	private carrinhoPage cart;
	@Before
	public void inicio() {
		System.setProperty("wedriver.gecko.driver", "C:\\DRIVERS\\geckodriver.exe");
		DriverFactory.getDriver().get("https://shopcart-challenge.4all.com/");
		home = new homePage(DriverFactory.getDriver());
		cart = new carrinhoPage(DriverFactory.getDriver());
		
	}
	
	@Test
	public void teste() {
		home.categoriaBebidas();
		home.todasBebidas();
		home.todasCategorias();
		home.addRisoles();
		home.carrinho();
		for(int i = 0;i<9;i++) {
			cart.aumentaRissole();
		}
		for(int i =0;i<5;i++) {
			cart.diminuiRissole();
		}
		Assert.assertEquals("R$ 36,00",cart.obtemPreco());
		cart.finalizaCompra();
		Assert.assertEquals("Pedido realizado com sucesso!", cart.obtemMensagemSucesso());
		cart.finalizar();
	}
}
