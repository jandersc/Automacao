// Nesta fase, serão concatenados todos os conceitos vistos até o momento e inserido o conceito de seleção de valor na lista através do "new Select"

package com.primeiropasso;//Pacote

import org.openqa.selenium.By;//Classe para localizar elementos
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ConceitosConcatenados {
	WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automação\\chromedriver32.exe");//Localização do motor instalado na máquina
		WebDriver driver = new ChromeDriver();
		driver.get("https://pt-br.facebook.com/");//abre a página 
		
		driver.manage().window().maximize();//Maximiza a tela
		
		driver.findElement(By.id("u_0_l")).clear();
		driver.findElement(By.id("u_0_l")).sendKeys("Automatizar");//Insere no textbox
		driver.findElement(By.id("u_0_n")).clear();
		driver.findElement(By.id("u_0_n")).sendKeys("Aos Domingos");
		driver.findElement(By.id("u_0_q")).clear();
		driver.findElement(By.id("u_0_q")).sendKeys("testedomingo@gmail.com");
		driver.findElement(By.id("u_0_t")).clear();
		driver.findElement(By.id("u_0_t")).sendKeys("testedomingo@gmail.com");
		driver.findElement(By.id("u_0_x")).clear();
		driver.findElement(By.id("u_0_x")).sendKeys("123456789000");
		
		WebElement dataDia = driver.findElement(By.id("day"));
		new Select (dataDia).selectByVisibleText("14");//Seleciona o número 14 dentro da lista
		
		WebElement dataMes = driver.findElement(By.id("month"));
		new Select (dataMes).selectByVisibleText("Abr");
		
		WebElement dataAno = driver.findElement(By.id("year"));
		new Select (dataAno).selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();//Seleciona o radio button referente ao sexo Masculino
		
		driver.findElement(By.id("u_0_13")).click();//Clica no botão "Abrir uma conta"
		
		driver.close();//Fecha a janela atual
		driver.quit();//Fecha todas as janelas

	}
}
