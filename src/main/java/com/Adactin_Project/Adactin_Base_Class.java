package com.Adactin_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String test) {

		if (test.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver1\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}
		return driver;
	}

	public static void geturl(String url) {

		driver.get(url);
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void selectValue(WebElement name, String arg) {
		Select s = new Select(name);
		s.selectByValue(arg);
	}

	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int val = Integer.parseInt(value);
			s.selectByIndex(val);
		} else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("visible text")) {
			s.selectByVisibleText(value);
		}
	}

	public static void pageWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void takeScreenShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sour = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(sour, des);

	}

}
