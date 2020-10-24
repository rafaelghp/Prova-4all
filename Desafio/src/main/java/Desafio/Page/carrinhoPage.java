package Desafio.Page;

import org.openqa.selenium.WebDriver;

public class carrinhoPage extends BasePage{

	
	public carrinhoPage(WebDriver driver) {
		super(driver);
	}
	public void aumentacoca() {
		dsl.clicaID("add-product-0-qtd");
	}
	public void diminuiCoca() {
		dsl.clicaID("remove-product-0-qtd");
	}
	public void aumentaFanta() {
		dsl.clicaID("add-product-1-qtd");
	}
	public void diminuiFanta() {
		dsl.clicaID("remove-product-1-qtd");
	}
	public void aumentaAgua() {
		dsl.clicaID("add-product-2-qtd");
	}
	public void diminuiAgua() {
		dsl.clicaID("remove-product-2-qtd");
	}
	public void aumentaRissole() {
		dsl.clicaID("add-product-3-qtd");
	}
	public void diminuiRissole() {
		dsl.clicaID("remove-product-3-qtd");
	}
	public void aumentaBrigadeiro() {
		dsl.clicaID("add-product-4-qtd");
	}
	public void diminuiBrigadeiro() {
		dsl.clicaID("remove-product-4-qtd");
	}
	public void aumentaAlfajor() {
		dsl.clicaID("add-product-5-qtd");
	}
	public void diminuiAlfajor() {
		dsl.clicaID("remove-product-5-qtd");
	}
	
	
	public String obtemPreco() {
		return dsl.obtemTextoId("price-total-checkout");
	}
	public void finalizaCompra() {
		dsl.clicaID("finish-checkout-button");
	}
	public String obtemMensagemSucesso() {
		return dsl.obtemTextoXpath("/html/body/div/div[3]/div/div/div/h2");
	}
	public void finalizar() {
		dsl.clicaXpath("/html/body/div/div[3]/div/div/div/button1");
	}
	
	
}
