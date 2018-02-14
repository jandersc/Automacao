// Deve ser importada a biblioteca do Apache POI
// Este código deveria abrir uma planilha e pegar o conteúdo da primeira célula, porém o mesmo está acusando erros que serão corrigidos


package com.primeiropasso;//Pacote
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException ;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 


public class ManipulaComponente {
	WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automação\\chromedriver32.exe");//Localização do motor instalado na máquina
		WebDriver driver = new ChromeDriver();
		driver.get("https://pt-br.facebook.com/");//abre a página 
		
		driver.manage().window().maximize();
		

        try{
	    FileInputStream file = new FileInputStream("C:\\Nova pasta\\Jhon.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook .  getSheetAt ( 0 ); 
	    Iterator<Row> rowIterator = sheet.iterator();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo Excel não encontrado!");
     }
     }
     }
