

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.firefox.MarionetteDriver;


public class TesteLoginFire {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Ambiente Teste\\Testes\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		
		driver.get("http://portalrm.montreal.com.br/");
		
		WebElement txtUsuario = driver.findElement(By.name("txtUser"));
		txtUsuario.sendKeys("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtPass")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement txtSenha = driver.findElement(By.name("txtPass"));
		txtSenha.sendKeys("");		
		
						
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("btnLogin")).click();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("btExit")).click();
		
		System.out.println("Operação realizada com sucesso");
			
					 		 
		driver.close();
		
	}
	
	
}
