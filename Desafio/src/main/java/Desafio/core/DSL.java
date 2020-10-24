package Desafio.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
	
	private WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clicaID(String id) {
		driver.findElement(By.id(id)).click();
	}
	public void clicaXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public String obtemTextoId(String id) {
		return driver.findElement(By.id(id)).getText();
	}
	public String obtemTextoXpath(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}

}
