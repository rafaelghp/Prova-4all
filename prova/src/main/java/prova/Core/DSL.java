package prova.Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
	

	
	
	
	
	public DSL(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	public void clickId(String id) {
		DriverFactory.getDriver().findElement(By.id(id)).click();
	}
	public void clickXpath(String Xpath) {
		DriverFactory.getDriver().findElement(By.xpath(Xpath)).click();
	}
	public String obtemTextoId(String id) {
		return DriverFactory.getDriver().findElement(By.id(id)).getText();
	}
	public String obtemTextoXpath(String xpath) {
		return DriverFactory.getDriver().findElement(By.xpath(xpath)).getText();
	}
}
