package com.twitter;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ManipulaComponente {

	public static void main(String[] args) {

		// CTRL + SHIFT + O ORGANIZA OS IMPORTS
		// CTRL + SHIFT + F INDENTA A CLASSE

		try {
			File exc = new File("C:\\workspaceadri\\Plan1.xls");
			FileInputStream bop = new FileInputStream(exc);
			HSSFWorkbook wb = new HSSFWorkbook(bop);
			HSSFSheet ce1 = wb.getSheetAt(0);

			for (int r = 0; r < 2; r++) {

				for (int i = 0; i < 2; i++) {

					System.out.println(ce1.getRow(r).getCell(i).getStringCellValue());

				}
			}

			//System.out.println(ce1.getRow(0).getCell(0).getStringCellValue());
			// System.out.println(ce1.getRow(0).getCell(1).getStringCellValue());
			// System.out.println(ce1.getRow(1).getCell(0).getStringCellValue());
			// System.out.println(ce1.getRow(1).getCell(1).getStringCellValue());

		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
//Metodo que devolve a lista de String(da planilha) será utilizado posteriormente na Classe AbrirNavegador
	
	public List<String> conteudoPlanilha() {

		List<String> lista = new ArrayList<>();
		try {
			File exc = new File("C:\\workspaceadri\\Plan1.xls");
			FileInputStream bop = new FileInputStream(exc);
			HSSFWorkbook wb = new HSSFWorkbook(bop);
			HSSFSheet ce1 = wb.getSheetAt(0);

			for (int r = 0; r < 2; r++) {

				for (int i = 0; i < 2; i++) {

					lista.add(ce1.getRow(r).getCell(i).getStringCellValue());

				}
			}

		} catch (Exception a) {
			System.out.println(a.getMessage());
		}

		return lista;
	}
}
