import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UtilizandoPhantom{

	public static void main(String[] args) throws Exception {
		System.setProperty("phantomjs.binary.path", "C:\\TesteSelenium\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");

		DesiredCapabilities desiredCapabilities = DesiredCapabilities.phantomjs();
		desiredCapabilities.setJavascriptEnabled(true);
		desiredCapabilities.setCapability("takesScreenshot", true);
		WebDriver driver = new PhantomJSDriver(desiredCapabilities);
		driver.get("https://www.instagram.com/accounts/login/?hl=pt-br");

		WebElement txtemail = driver.findElement(By.name("username"));
		txtemail.sendKeys("TESTE NOME");
		
		WebElement txtsenha = driver.findElement(By.name("password"));
		txtsenha.sendKeys("TESTE SENHA");
		
		System.out.println("Usario e senha inseridos com sucesso utilizando Selenium");

	}

}
