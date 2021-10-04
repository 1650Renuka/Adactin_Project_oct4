package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fifth_Page {
	
	public WebDriver driver;
	
	public Fifth_Page(WebDriver driver1) {

		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
//	itinerary
	@FindBy(xpath = "//a[.='Booked Itinerary']" )
	private WebElement iter;

	public WebElement getIter() {
		return iter;
	}
	

}
