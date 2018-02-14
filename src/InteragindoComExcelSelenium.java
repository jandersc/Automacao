
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragindoComExcelSelenium{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conrado\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com");

		InteragindoComExcelSelenium mc = new InteragindoComExcelSelenium();
		List<String> lista = mc.conteudoPlanilha();

		WebElement txtemail = driver.findElement(By.name("user[email]"));
		txtemail.sendKeys(lista.get(2));
    //O conteudo da lista(seu respectivo valor contido na planilha)

		WebElement txtsenha = driver.findElement(By.name("user[user_password]"));
		txtsenha.sendKeys(lista.get(3));

		
		System.out.println("Usario e senha inseridos com sucesso utilizando Selenium");

		driver.quit();

	}

	private List<String> conteudoPlanilha() {
		// TODO Auto-generated method stub
		return null;
	}

}
