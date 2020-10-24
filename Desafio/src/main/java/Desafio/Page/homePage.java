package Desafio.Page;

import org.openqa.selenium.WebDriver;

public class homePage extends BasePage{

	
	public homePage(WebDriver driver) {
		super(driver);
	}
	public void categoriaBebidas() {
		dsl.clicaID("open-categories-btn");
		dsl.clicaID("category-0");
	}
	public void categoriaDoces() {
		dsl.clicaID("open-categories-btn");
		dsl.clicaID("category-1");
	}
	public void categoriaSalgados() {
		dsl.clicaID("open-categories-btn");
		dsl.clicaID("category-2");
	}
	public void categoriaPratosQuentes() {
		dsl.clicaID("open-categories-btn");
		dsl.clicaID("category-3");
	}
	public void todasCategorias() {
		dsl.clicaID("open-categories-btn");
		dsl.clicaID("category-all");
	}
	public void addCocaCola() {
		dsl.clicaID("add-product-0-btn");
	}
	public void addFantaUva() {
		dsl.clicaID("add-product-1-btn");
	}
	public void addAguaSGas() {
		dsl.clicaID("add-product-2-btn");
	}
	public void addRisoles() {
		dsl.clicaID("add-product-3-btn");
	}
	public void addBrigadeiro() {
		dsl.clicaID("add-product-4-btn");
	}
	public void addAlfajor() {
		dsl.clicaID("add-product-5-btn");
	}
	public void todasBebidas() {
		dsl.clicaID("add-product-0-btn");
		dsl.clicaID("add-product-1-btn");
		dsl.clicaID("add-product-2-btn");
	}
	public void todosDoces() {
		dsl.clicaID("add-product-4-btn");
		dsl.clicaID("add-product-5-btn");
	}
	public void carrinho() {
		dsl.clicaID("cart-products-qtd");
	}
}
