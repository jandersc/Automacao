import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class CapturarTelaComTakesScreenshot {
	public static void main(String[]args) throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://twitter.com");
		//06/02/2018
    //uso da classe TakesScreenshot para capturar a tela do Twitter
		//uso do metodo getScreenshotAs(OutputType.FILE) para capturar e guardar no local especifico
		//uso do FileUtils para copiar o arquivo capturado para determinada página
		//uso da exceção caso a implementação não possa suportar a captura da tela
		
		
		WebElement txtemail = driver.findElement(By.name("user[email]"));
	  	txtemail.sendKeys("grupodetestesb@gmail.com TESTE JANDER CERQUEIRA");
	  	
	  	WebElement txtsenha = driver.findElement(By.name("user[user_password]"));
	  	txtsenha.sendKeys("1112364");
	  	
	  	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Picture\\screenshot.png"));
	  	
	  	System.out.println("Tela capturada com sucesso utilizando Selenium");
	  	
	  	driver.quit(); 
	  	
	}
	
}
