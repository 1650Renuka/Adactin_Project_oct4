package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fourth_Page {
	
public WebDriver driver;
	
	public Fourth_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
//	FirstName
	@FindBy(id="first_name")
	private WebElement fname;

	public WebElement getName() {
		return fname;
	}
	
//	LastName
	@FindBy(id="last_name")
	private WebElement lname;

	public WebElement getLname() {
		return lname;
	}

//	Address
	@FindBy(name="address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
//	CC_Num
	@FindBy(name="cc_num")
	private WebElement number;

	public WebElement getNumber() {
		return number;
	}
	
//	card
	@FindBy(id = "cc_type")
	private WebElement cardType;
	
    public WebElement getCardType() {
		return cardType;
	}

//	Month
	@FindBy(name="cc_exp_month")
	private WebElement month;

	public WebElement getMonth() {
		return month;
	}
	
//	Year
	@FindBy(name="cc_exp_year")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}
	
//	CVV
	@FindBy(name="cc_cvv")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}
	
//	Book now
	@FindBy(name="book_now")
	private WebElement book;

	public WebElement getBook() {
		return book;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	

}
