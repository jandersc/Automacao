
package com.twitter;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbrirNavegador {
	
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conrado\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://twitter.com");
		//06/02/2018
    //uso da classe TakesScreenshot para capturar a tela do Twitter(Comentado)
		//uso do metodo getScreenshotAs(OutputType.FILE) para capturar e guardar no local especifico
		//uso do FileUtils para copiar o arquivo capturado para determinada página
		//uso da exceção caso a implementação não possa suportar a captura da tela
		
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("C:\\Picture\\screenshot.png"));
		//WebElement txtemail = driver.findElement(By.name("user[email]"));
	  	//txtemail.sendKeys("grupodetestesb@gmail.com");
	  	
	  	//WebElement txtsenha = driver.findElement(By.name("user[user_password]"));
	  	//txtsenha.sendKeys("1112364");
		//09/02/2018 --> Correção do código para apresentar o componente que movimento o mouse e aciona o evento click do mouse
		
		
		Actions act = new Actions(driver); 
		WebElement menuDropDown = driver.findElement(By.linkText("Entrar"));
		act.moveToElement(menuDropDown);
		act.click();
		act.perform();
	
	  	driver.quit(); 
	  	
	}
	
}
