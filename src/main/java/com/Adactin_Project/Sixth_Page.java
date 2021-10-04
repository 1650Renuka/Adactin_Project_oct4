package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sixth_Page {
	
public WebDriver driver;
	
	public Sixth_Page(WebDriver driver1) {

		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
//	Logout
	@FindBy(id = "logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
