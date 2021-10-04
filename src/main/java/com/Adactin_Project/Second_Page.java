package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Second_Page {
	
public WebDriver driver;
	
	public Second_Page(WebDriver driver1) {

		this.driver=driver1;
		PageFactory.initElements(driver,this);
	}
	
//	Location
	@FindBy(id="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
//	Hotels
	@FindBy(id="hotels")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}

//	Room Type
    @FindBy(id="room_type")
    private WebElement room;

	public WebElement getRoom() {
		return room;
	}

//	NO.Of Rooms
	@FindBy(id="room_nos")
	private WebElement room_No;

	public WebElement getRoom_No() {
		return room_No;
	}

//	Adult
	@FindBy(id="adult_room")
	private WebElement adult;

	public WebElement getAdult() {
		return adult;
	}
	
//	Child Room
	@FindBy(id="child_room")
	private WebElement child;

	public WebElement getChild() {
		return child;
	}

//	Search
	@FindBy(id="Submit")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	

}
