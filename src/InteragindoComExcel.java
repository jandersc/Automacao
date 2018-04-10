// Deve ser importada a biblioteca do Apache POI
// Este código deveria abrir uma planilha e pegar o conteúdo da primeira célula, porém o mesmo está acusando erros que serão corrigidos

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException ;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 


public class InteragindoComExcel {
	WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");//Localização do motor instalado na máquina
		WebDriver driver = new ChromeDriver();
		driver.get("https://pt-br.facebook.com/");//abre a página 
		
		driver.manage().window().maximize();
		

        try{
	    FileInputStream file = new FileInputStream("C:\\TesteSelenium\\Teste.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook .  getSheetAt ( 0 ); 
	    Iterator<Row> rowIterator = sheet.iterator();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo Excel não encontrado!");
     }
     }
     }
