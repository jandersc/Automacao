import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InteragindoComExcelUtilizandoFOR {

	public static void main(String[] args) {

		// CTRL + SHIFT + O ORGANIZA OS IMPORTS
		// CTRL + SHIFT + F INDENTA A CLASSE

		try {
			File exc = new File("C:\\TesteSelenium\\Teste.xls");
			FileInputStream bop = new FileInputStream(exc);
			HSSFWorkbook wb = new HSSFWorkbook(bop);
			HSSFSheet ce1 = wb.getSheetAt(0);

			for (int r = 0; r < 5; r++) {

				for (int i = 0; i < 5; i++) {

					System.out.println(ce1.getRow(r).getCell(i).getStringCellValue());

				}
			}

		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	//Metodo que devolve a lista de String(da planilha) será utilizado posteriormente na Classe AbrirNavegador


	public List<String> conteudoPlanilha() {

		List<String> lista = new ArrayList<>();
		try {
			File exc = new File("C:\\TesteSelenium\\Teste.xlsx");
			FileInputStream bop = new FileInputStream(exc);
			XSSFWorkbook wb = new XSSFWorkbook(bop);
			XSSFSheet ce1 = wb.getSheetAt(0);

			for (int r = 0; r < 5; r++) {

				for (int i = 0; i < 5; i++) {

					lista.add(ce1.getRow(r).getCell(i).getStringCellValue());

				}
			}

		} catch (Exception a) {
			System.out.println(a.getMessage());
		}

		return lista;
	}
}
