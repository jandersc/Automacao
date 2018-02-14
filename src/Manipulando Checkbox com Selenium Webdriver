//Utilizando o Selenium Webdriver com Java
//Utilizando um servidor Tomcat (Não utilizando framework de teste)

//Como manipular um componente Checkbox com Selenium Webdriver


package com.primeiropasso;   //Pacote

import org.openqa.selenium.By;    //Biblioteca para localizar elementos
import org.openqa.selenium.WebDriver;     //Biblioteca do Webdriver
import org.openqa.selenium.chrome.ChromeDriver;     //Biblioteca do motor do ChromeDriver

  public class ManipulaComponenteCheckbox {
	WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automação\\chromedriver32.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html"); 

		//clicar no checkbox
		driver.findElement(By.id("isAgeSelected")).click();

		driver.close(); 
		driver.quit(); 

	}
}
