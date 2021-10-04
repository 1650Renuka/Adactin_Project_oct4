package com.Adactin_Project;

import org.openqa.selenium.WebDriver;

public class Auto_page extends Adactin_Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static Project_Object_Manager pom = new Project_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		String url = Adactin_File_Read_Manager.getInstance().getInstanceCR().getUrl();
		geturl(url);

		String username = Adactin_File_Read_Manager.getInstance().getInstanceCR().getUsername();
		inputValueElement(pom.getFP().getUsername(), username);

		String password = Adactin_File_Read_Manager.getInstance().getInstanceCR().getPassword();
		inputValueElement(pom.getFP().getPassword(), password);

		clickElement(pom.getFP().getLogin());

		String location = Adactin_File_Read_Manager.getInstance().getInstanceCR().getLocation();
		selectValue(pom.getSP().getLocation(), location);

		String hotel = Adactin_File_Read_Manager.getInstance().getInstanceCR().getHotel();
		selectValue(pom.getSP().getHotel(), hotel);

		String room = Adactin_File_Read_Manager.getInstance().getInstanceCR().getRoomType();
		selectValue(pom.getSP().getRoom(), room);

		Thread.sleep(2000);
		String room_No = Adactin_File_Read_Manager.getInstance().getInstanceCR().getRoomNo();
		selectValue(pom.getSP().getRoom_No(), room_No);

		String adult = Adactin_File_Read_Manager.getInstance().getInstanceCR().getAdult();
		selectValue(pom.getSP().getAdult(), adult);

		String child = Adactin_File_Read_Manager.getInstance().getInstanceCR().getChild();
		selectValue(pom.getSP().getChild(), child);

		clickElement(pom.getSP().getSearch());

		clickElement(pom.getTP().getRadio());

		clickElement(pom.getTP().getCont());

		String fname = Adactin_File_Read_Manager.getInstance().getInstanceCR().getFirstName();
		inputValueElement(pom.getFOP().getName(), fname);

		String lname = Adactin_File_Read_Manager.getInstance().getInstanceCR().getLastName();
		inputValueElement(pom.getFOP().getLname(), lname);

		String address = Adactin_File_Read_Manager.getInstance().getInstanceCR().getAddress();
		inputValueElement(pom.getFOP().getAddress(), address);

		String ccNum = Adactin_File_Read_Manager.getInstance().getInstanceCR().getCCNum();
		inputValueElement(pom.getFOP().getNumber(), ccNum);

//		Thread.sleep(2000);
		String card = Adactin_File_Read_Manager.getInstance().getInstanceCR().getCard();
//		dropDown(pom.getFOP().getCardType(), "visible text", card);
		selectValue(pom.getFOP().getCardType(), card);
		
		String month = Adactin_File_Read_Manager.getInstance().getInstanceCR().getMonth();
//		dropDown(pom.getFOP().getMonth(), "visible text", month);
		selectValue(pom.getFOP().getMonth(), month);
		
		String year = Adactin_File_Read_Manager.getInstance().getInstanceCR().getYear();
//		dropDown(pom.getFOP().getYear(), "visible text", year);
		selectValue(pom.getFOP().getYear(), year);

		String ccv = Adactin_File_Read_Manager.getInstance().getInstanceCR().getCCv();
		inputValueElement(pom.getFOP().getCvv(), ccv);

		clickElement(pom.getFOP().getBook());
		Thread.sleep(2000);

		clickElement(pom.getFIP().getIter());
		
		takeScreenShot("C:\\Users\\RENUKA\\eclipse-workspace\\Adactin_Project\\screenShot\\adactin.png");
		
		clickElement(pom.getSIP().getLogout());
        driver.close();
		

	}

}
