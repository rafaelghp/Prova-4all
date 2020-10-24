package Desafio.Page;

import org.openqa.selenium.WebDriver;

import Desafio.core.DSL;

public class BasePage {
protected DSL dsl  ;
	
	public BasePage(WebDriver driver) {
		dsl = new DSL(driver);
	}
}
