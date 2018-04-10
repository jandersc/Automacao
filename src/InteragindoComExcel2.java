
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class InteragindoComExcel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		File exc=new File("C:\\TesteSelenium\\Teste.xlsx");
		FileInputStream bop=new FileInputStream(exc);
		HSSFWorkbook wb = new  HSSFWorkbook(bop);
		HSSFSheet ce1 = wb.getSheetAt(0);
		
		System.out.println(ce1.getRow(0).getCell(0).getStringCellValue());
		System.out.println(ce1.getRow(0).getCell(1).getStringCellValue());
		System.out.println(ce1.getRow(1).getCell(0).getStringCellValue());
		System.out.println(ce1.getRow(1).getCell(1).getStringCellValue());
				
		}catch(Exception a){
			System.out.println(a.getMessage());
		}
	}

}
