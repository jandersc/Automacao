

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MontrealAcessoIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver","C:\\Ambiente Teste\\Testes\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://localhost:8080/idnet/atendimento/pedido-online/pedido-online-pesquisa.xhtml/");
		
		WebElement txtUsuario = driver.findElement(By.id("j_idt4:login"));
		driver.findElement(By.id("j_idt4:login")).click();
		txtUsuario.sendKeys("MASTER");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.id("j_idt4:senha")).click();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		WebElement txtSenha = driver.findElement(By.name("j_idt4:senha"));
		driver.findElement(By.id("j_idt4:senha")).click();
		txtSenha.sendKeys("desenv");		
		
						
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement txtPosto = driver.findElement(By.id("j_idt4:postoAC_input"));
		driver.findElement(By.id("j_idt4:postoAC_input")).click();
		txtPosto.sendKeys("Rio Largo");
		//driver.findElements(By.name("Rio Largo"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("ui-autocomplete-item ui-autocomplete-list-item ui-corner-all"));
		//driver.navigate("RIO LARGO");
		
		
		driver.findElement(By.id("j_idt4:acessar")).click();
		 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.className("dropdown-toggle")).click();
		
		System.out.println("Operação realizada com sucesso");
			
					 		 
		driver.close();
		
		
		
		
	}

}
