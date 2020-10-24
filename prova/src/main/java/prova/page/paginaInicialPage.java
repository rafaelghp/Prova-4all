package prova.page;

import org.openqa.selenium.WebDriver;

public class paginaInicialPage extends BasePage {
		
	
	public paginaInicialPage(WebDriver driver) {
		super(driver);
		
	}
	public void categoriaDoces() {
		dsl.clickId("open-categories-btn");
		dsl.clickId("category-1");	
	}
	public void categoriaBebidas() {
		dsl.clickId("open-categories-btn");
		dsl.clickId("category-0");	
	}
	public void adicionaBrigadeiro() {
		dsl.clickId("add-product-4-btn");
	}
	public void adicionaAlfajor() {
		dsl.clickId("add-product-5-btn");
	}
	public void adicionaCocacola() {
		dsl.clickId("add-product-0-btn");
	}
	public void adicionaFantaUva() {
		dsl.clickId("add-product-1-btn");
	}
	public void adicionaAguaSGas() {
		dsl.clickId("add-product-2-btn");
	}
	public void adicionaRisoles() {
		dsl.clickId("add-product-3-btn");
	}
	public void todasCategorias() {
		dsl.clickId("open-categories-btn");
		dsl.clickId("category-all");
	}
	public void carrinho() {
		dsl.clickId("cart-btn");
	}
}
