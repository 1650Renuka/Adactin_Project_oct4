package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Page {
	
	public WebDriver driver;
	
	public First_Page(WebDriver driver1) {

		this.driver=driver1;
		PageFactory.initElements(driver,this);
	}
	
//	UserName
	@FindBy(id="username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
//	Password
	@FindBy(id="password")
	private WebElement pass;

	public WebElement getPassword() {
		return pass;
	}

//	Login
	@FindBy(id="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
}
