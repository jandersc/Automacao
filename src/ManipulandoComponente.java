// Pré-requisitos para realizar a automação sem o uso de um framework de teste:
//- Ter o Eclipse (Ambiente de Desenvolvimento)
//- Linguagem de Programação (JDK)
//- Ter os Navegadores
//- Ter o driver do selenium
//- Ter os drivers (motores) dos navegadores
//- Ter um servidor (Neste caso foi utilizado o Tomcat)

package com.primeiropasso;   //Pacote

import org.openqa.selenium.By;    //Biblioteca para localizar elementos
import org.openqa.selenium.WebDriver;     //Biblioteca do Webdriver
import org.openqa.selenium.chrome.ChromeDriver;     //Biblioteca do motor do ChromeDriver

public class ManipulaComponenteRadiobutton {
	WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automação\\chromedriver32.exe");//Local do motor instalado na máquina
		WebDriver driver = new ChromeDriver();  //Instancia
		driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");  //Abre a página
		driver.findElement(By.xpath("//input[@name='optradio' and @value='Female']")).click();  //Seleciona o radio button Female	
		driver.findElement(By.id("buttoncheck")).click();  //Clica no botão verificador	
        
		driver.close();  //Fecha a janela atual
		driver.quit();  //Fecha todas as janelas do navegador

	}
}
