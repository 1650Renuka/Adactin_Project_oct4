package com.Testng.Adactin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Adactin_Project.Adactin_Base_Class;
import com.Adactin_Project.Adactin_File_Read_Manager;
import com.Adactin_Project.Project_Object_Manager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestNg_Demo_Runner extends Adactin_Base_Class  {
	
	public static WebDriver driver = getBrowser("chrome");;
	public static Project_Object_Manager pom = new Project_Object_Manager(driver);
	
	ExtentReports report;
	ExtentTest test;
	ExtentSparkReporter sparkreport;
	
	@BeforeTest
	private void config() {
		
		sparkreport = new ExtentSparkReporter(".//Test_Report//TestNG.html");
		report = new ExtentReports();
		report.attachReporter(sparkreport);
        test = report.createTest("Config");
		
	}
	
	
	@Test
	private void launch_Url() throws Throwable {

		String url = Adactin_File_Read_Manager.getInstance().getInstanceCR().getUrl();
		geturl(url);
	}
	
	@Test
	private void username() {

		inputValueElement(pom.getFP().getUsername(),"Renuka1650" );
		test = report.createTest("Username Validation");
	}
	
	@Test(priority = 0)
	private void password() {

		inputValueElement(pom.getFP().getPassword(),"Renuka@1650" );
		test = report.createTest("Password Validation");
	}

@Test(priority = 1)
private void login() {

	clickElement(pom.getFP().getLogin());
}
	
	@AfterTest
	private void tearDown() {

		report.flush();
	}

}
