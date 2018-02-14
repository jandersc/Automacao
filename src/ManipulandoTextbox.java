package com.twitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class AbrirNavegador {
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conrado\\Desktop\\Selenium\\chromedriver.exe");
		
	WebDriver  driver = new ChromeDriver();
	 driver.get("https://twitter.com");
	  WebElement txtemail = driver.findElement(By.name("user[email]"));
	  	txtemail.sendKeys("grupodetestesb@gmail.com");
	  	
	  	WebElement txtsenha = driver.findElement(By.name("user[user_password]"));
	  	txtsenha.sendKeys("1112364");
	  	
	  	System.out.println("Operador textbox executado com sucesso utilizando Selenium");
	  	
	  	
	  	driver.quit(); 
	  	
	}
	
}
