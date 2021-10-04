package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Third_Page {
	
public WebDriver driver;
	
	public Third_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
//	clickbutton
	@FindBy(id="radiobutton_0")
	private WebElement radio;

	public WebElement getRadio() {
		return radio;
	}

//	Continue
	@FindBy(id="continue")
	private WebElement cont;

	public WebElement getCont() {
		return cont;
	}


}
