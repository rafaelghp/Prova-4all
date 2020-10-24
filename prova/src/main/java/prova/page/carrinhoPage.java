package prova.page;


import org.openqa.selenium.WebDriver;

public class carrinhoPage extends BasePage {

	
	public carrinhoPage(WebDriver driver) {
		super(driver);
	
	}
	public void adicionaBrigadeiro() {
		dsl.clickId("add-product-4-qtd");
	}
	public void adicionaRisoles() {
		dsl.clickId("add-product-3-qtd");
	}
	public void removeRisoles() {
		dsl.clickId("remove-product-3-qtd");
	}
	public void finalizaCompra() {
		dsl.clickId("finish-checkout-button");
	}
	public String mensagemSucesso() {
		return dsl.obtemTextoXpath("/html/body/div/div[3]/div/div/div/h2");
	}
	public void fechaMensagemCompra() {
		 dsl.clickXpath("//*[@id=\"root\"]/div[3]/div/div/div/button");
	}
	public String obtemPreço() {
		return dsl.obtemTextoId("price-total-checkout");
	}
	
}
