import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClasseRobot {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conrado\\Desktop\\Selenium\\chromedriver.exe");
	
	WebDriver  driver = new ChromeDriver();
	driver.get("https://www.freepdfconvert.com/pt");
	driver.findElement(By.id("clientUpload")).click();
	StringSelection arq = new StringSelection("C:\\workspaceadri\\javaconv.pdf");//StringSelection -->classe responsável pela transferência da String
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(arq, null);//conjunto de ferramentas padrão.
	//getSystemClipboard --> classe que implementa um mecanismo para transferir dados usando operações de corte / cópia / pasta.
	//setContents --> Conteudo de transfer�ncia
	
	Robot robot = new Robot();
	robot.delay(1000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.delay(1000);
	//Robot -->Esta classe é usada para gerar eventos de entrada do sistema nativo para fins de automação de teste, demonstrações auto-executadas e outras aplicações onde o controle do mouse e do teclado é necessário. O objetivo principal do Robot é facilitar o teste automatizado das implementações da plataforma Java.
	//Os comandos da classe Robot(VK_CONTROL, VK_V...etc) são semelhantes ao que utilizamos(teclas especiais e de atalho) Você pressiona o Ctrl, pressiona o V, então solta o V, e depois disso solta o Ctrl.
	
	driver.quit();
	driver.close();
}
}
