import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLoopUOL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://email.uol.com.br");
		
		WebElement txtUsuario = driver.findElement(By.name("user"));
		int i=1; //Criando uma variável e atribuindo o valor 1
		while(i<=10){ //Loop de valor inicial da variável até 10
		txtUsuario.sendKeys("TESTE"+i+", ");//concatenando o texto com a variável
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		i++;//incrementando na variável
		}
		
		WebElement txtSenha = driver.findElement(By.name("pass"));
		txtSenha.sendKeys("000");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		System.out.println("Operação realizada com sucesso");
						 		 		
	}

}
