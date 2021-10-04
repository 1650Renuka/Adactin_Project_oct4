package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Project_Object_Manager {
	
	public WebDriver driver;
	
	private First_Page fp;
	private Second_Page sp;
	private Third_Page tp;
	private Fourth_Page fop;
	private Fifth_Page fip;
	private Sixth_Page sip;
	
	public Project_Object_Manager(WebDriver driver1) {

		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public First_Page getFP() {

		fp = new First_Page(driver);
		return fp;
	}
	
	public Second_Page getSP() {

		sp = new Second_Page(driver);
		return sp;
	}
	
	public Third_Page getTP() {

		tp = new Third_Page(driver);
		return tp;
	}
	
	public Fourth_Page getFOP() {

		fop = new Fourth_Page(driver);
		return fop;
	}
	
	public Fifth_Page getFIP() {

		fip = new Fifth_Page(driver);
		return fip;
	}
	
	public Sixth_Page getSIP() {

		sip = new Sixth_Page(driver);
		return sip;
	}

}
