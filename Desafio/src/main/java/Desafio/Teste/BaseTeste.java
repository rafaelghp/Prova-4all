package Desafio.Teste;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Desafio.core.DriverFactory;
 

public class BaseTeste {
	
	@Rule
	public TestName testeName = new TestName();
	@After
	public void fim() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
		File  arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo,new File("target"+File.separator + "screenshot"+ File.separator +testeName.getMethodName()+".jpg"));
		DriverFactory.killDriver();
	}
}
