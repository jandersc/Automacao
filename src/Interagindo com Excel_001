package com.twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;//Classe para localizar elementos
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ManipulaComponente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		File exc=new File("C:\\workspaceadri\\Plan1.xls");
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
