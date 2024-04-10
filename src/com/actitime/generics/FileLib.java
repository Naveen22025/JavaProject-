package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FileLib {

	public String Property(String key) throws IOException {

		FileInputStream fis = new FileInputStream("./data/common.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data; 

	}

	public String GetExceldata(String sheet, int row, int cell ) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./data/test.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;

	}

	public void SetExceldata(String sheet, int row, int cell, String path) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./data/test.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(path);

		FileOutputStream fos= new FileOutputStream("./data/test.xlsx");
		wb.write(fos);
		wb.close();

	}

	public void Selector(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);

	}
	public void Selectorind(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public void Action(WebDriver driver, WebElement log) {
		Actions a= new Actions(driver);
		a.doubleClick(log).perform();
	}
}


