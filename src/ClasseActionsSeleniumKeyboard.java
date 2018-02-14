import org.openqa.selenium.By; //Classe para localizar elementos
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClasseActionsSeleniumKeyboard {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conrado\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement txtUsername = driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder;
		builder.moveToElement(txtUsername);
		builder.click();
		builder.keyDown(txtUsername,Keys.SHIFT);
	    builder.sendKeys("grupo bope");
	    builder.keyUp(txtUsername,Keys.SHIFT);
	    builder.doubleClick(txtUsername);
	    builder.contextClick();
		
		seriesOfActions.perform();
}

	
}
