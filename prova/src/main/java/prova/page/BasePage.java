package prova.page;

import org.openqa.selenium.WebDriver;

import prova.Core.DSL;

public class BasePage {
	protected DSL dsl; 
	
	public BasePage(WebDriver driver) {
		dsl = new DSL(driver);
	}
}
