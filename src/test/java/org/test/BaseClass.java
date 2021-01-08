package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions a;

	public static WebDriver loadBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\GREEN TECHNOLOGY\\eclipse\\FrameWorks\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void launchBrowser(String url) {
		driver.get(url);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String takeText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static String attribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		return attribute;
		
	}

	public static void dragDrop(WebElement src, WebElement dst) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dst).perform();
	}

	public static void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element);
	}

	public static void moveCursor(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void clickTwice(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element);
	}

	public static void rightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element);
	}
	
	public static void click(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		

	}

	public static void selectText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static String excelRead(int rowNo, int cellNo) throws IOException {

		File file = new File("C:\\Users\\AJAY\\Desktop\\Amazon.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fileInputStream);

		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);

		int cellType = cell.getCellType();

		String value;

		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {

			Date d = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
			value = s.format(d);
		}

		else {
			double dd = cell.getNumericCellValue();
			long l = (long) dd;
			value = String.valueOf(l);
		}
		return value;
	}

	public static void excelWrite(String value, int rowNo, int cellNo) throws IOException {

		File file = new File("C:\\Users\\AJAY\\Desktop\\sample.xlsx");
		FileInputStream fin = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fin);

		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.createRow(rowNo);
		Cell cell = row.createCell(cellNo);

		cell.setCellValue(value);
		FileOutputStream fout = new FileOutputStream(file);
		w.write(fout);

	}

	public static void excelReplace(String text2, int rowNo, int cellNo) throws IOException {

		File file = new File("E:\\GREEN TECHNOLOGY\\eclipse\\FrameWorks\\ExcelFolder\\sample.xlsx");
		FileInputStream fin = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fin);

		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);

		cell.setCellValue(text2);

		FileOutputStream fout = new FileOutputStream(file);
		w.write(fout);
	}


}
