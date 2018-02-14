package SPTrans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
				
		driver.get("http://10.34.196.38:8080/sbe-web-backoffice/#/pagina-inicial");
		
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout (10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout (10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout (10, TimeUnit.SECONDS);
		/*driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		/*WebElement txtUsuario = driver.findElement(By.name("txtUser"));
		txtUsuario.sendKeys("30801681");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtPass")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement txtSenha = driver.findElement(By.name("txtPass"));
		txtSenha.sendKeys("02504608586");
		
		WebElement txtAlias = driver.findElement(By.name("ddlAlias"));
		txtAlias.sendKeys("CorporeRM_PC");
						
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("btnLogin")).click();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("btExit")).click();
		
		*/
		
		System.out.println("Operação realizada com sucesso");
						 		 
		
	}

}
