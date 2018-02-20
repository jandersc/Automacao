import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;

public class DualList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://czeckd.github.io/angular-dual-listbox/demo/");
		driver.findElement(By.xpath("//li")).click();
	    driver.findElement(By.xpath("//li[3]")).click();
	    driver.findElement(By.xpath("//li[5]")).click();
	    driver.findElement(By.name("addBtn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				
		System.out.println("Operação realizada com sucesso");
						 		 		
	}

}
