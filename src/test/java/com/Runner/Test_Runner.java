package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Project.Adactin_Base_Class;
import com.Adactin_Project.Adactin_File_Read_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\java\\com\\Adactin_Feature\\Adactin.feature",
		glue = "com.StepDef",
		monochrome = true,
		dryRun = false,
		strict = true,
		tags = ("~@regressionTest"),
		plugin = {"html:Report/Cucumber_Report",
				         "pretty",
				         "json:Report/JsonReport.json",
				         "com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent.html"
				
	           	}
		
		)
public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {

	   String browser = Adactin_File_Read_Manager.getInstance().getInstanceCR().getBrowser();
       driver = Adactin_Base_Class.getBrowser(browser);

	}
	
	@AfterClass
	public static void tear_Down() {

		driver.close();
	}

}
