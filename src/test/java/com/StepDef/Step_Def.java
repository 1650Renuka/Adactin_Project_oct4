package com.StepDef;


import org.openqa.selenium.WebDriver;

import com.Adactin_Project.Adactin_Base_Class;
import com.Adactin_Project.Adactin_File_Read_Manager;
import com.Adactin_Project.Project_Object_Manager;
import com.Runner.Test_Runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends Adactin_Base_Class {
	
	public static WebDriver driver = Test_Runner.driver;
	
	public static Project_Object_Manager pom = new Project_Object_Manager(driver);
	
	@Before
	public static void beforeHooks(Scenario s) throws Throwable {

		System.out.println("Before Hooks");
		String status = s.getStatus();
		System.out.println("Status : " +status);
		
		if (s.isFailed()) {
			takeScreenShot("path");
		}
		
	}
	
	@After
	public static void afterHooks(Scenario s) throws Throwable {

		System.out.println("After Hooks");
		String status = s.getStatus();
		System.out.println("Status : " +status);
		
		if (s.isFailed()) {
			takeScreenShot("path");
		}
		
	}
	
	
	@Given("^User Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		String url = Adactin_File_Read_Manager.getInstance().getInstanceCR().getUrl();
		geturl(url);
	}
	
	@When("^User Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	   
		inputValueElement(pom.getFP().getUsername(), username);
	}

	@When("^User Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {


		inputValueElement(pom.getFP().getPassword(), password);
	}


	@Then("^User Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {

	    clickElement(pom.getFP().getLogin()); 
		
	}
	
	@When("^User Select The \"([^\"]*)\"$")
	public void user_Select_The(String location) throws Throwable {
	   
		selectValue(pom.getSP().getLocation(), location);
		
	}

	@When("^User Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {

	    String hotel = Adactin_File_Read_Manager.getInstance().getInstanceCR().getHotel();   
		selectValue(pom.getSP().getHotel(), hotel);
	}

	@When("^User Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {

	   String roomType = Adactin_File_Read_Manager.getInstance().getInstanceCR().getRoomType();
	   selectValue(pom.getSP().getRoom(), roomType);
	}

	@When("^User Select The Number of Rooms$")
	public void user_Select_The_Number_of_Rooms() throws Throwable {
	  
		String roomNo = Adactin_File_Read_Manager.getInstance().getInstanceCR().getRoomNo();
		selectValue(pom.getSP().getRoom_No(), roomNo);
	}


	@When("^User Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {

        String adult = Adactin_File_Read_Manager.getInstance().getInstanceCR().getAdult();
		selectValue(pom.getSP().getAdult(), adult);
	}

	@When("^User Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
	   
		String child = Adactin_File_Read_Manager.getInstance().getInstanceCR().getChild();
		selectValue(pom.getSP().getChild(), child);
	}

	@Then("^User Click On The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
	  
		clickElement(pom.getSP().getSearch());
		
	}

	@When("^User Click On The Select Button$")
	public void user_Click_On_The_Select_Button() throws Throwable {
	   
		clickElement(pom.getTP().getRadio());
	}

	@Then("^User Click On The Continue Button And It Navigates To The Book A Hotel$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel() throws Throwable {
	  
		clickElement(pom.getTP().getCont());
	}

	@When("^User Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	  
		String firstName = Adactin_File_Read_Manager.getInstance().getInstanceCR().getFirstName();
		inputValueElement(pom.getFOP().getName(), firstName);
	}

	@When("^User Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	    
		String lastName = Adactin_File_Read_Manager.getInstance().getInstanceCR().getLastName();
		inputValueElement(pom.getFOP().getLname(), lastName);
	}

	@When("^User Enter The Billing Address In Address Field$")
	public void user_Enter_The_Billing_Address_In_Address_Field() throws Throwable {
	    
		String address = Adactin_File_Read_Manager.getInstance().getInstanceCR().getAddress();
		inputValueElement(pom.getFOP().getAddress(), address);
	}

	@When("^USer Enter The Credit Card No In Card No Field$")
	public void user_Enter_The_Credit_Card_No_In_Card_No_Field() throws Throwable {
	   
		String ccNum = Adactin_File_Read_Manager.getInstance().getInstanceCR().getCCNum();
		inputValueElement(pom.getFOP().getNumber(), ccNum);
	}

	@When("^User Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
	   
		String card = Adactin_File_Read_Manager.getInstance().getInstanceCR().getCard();
		selectValue(pom.getFOP().getCardType(), card);
	}

	@When("^User Select Expiry Month$")
	public void user_Select_Expiry_Month() throws Throwable {
		
		String month = Adactin_File_Read_Manager.getInstance().getInstanceCR().getMonth();
		selectValue(pom.getFOP().getMonth(), month);
	}

	@When("^User Select The Expiry Year$")
	public void user_Select_The_Expiry_Year() throws Throwable {
	    
		String year = Adactin_File_Read_Manager.getInstance().getInstanceCR().getYear();
		selectValue(pom.getFOP().getYear(), year);
	}

	@When("^User Enter The CVV Number In Cvv Number Field$")
	public void user_Enter_The_CVV_Number_In_Cvv_Number_Field() throws Throwable {
	    
		String cCv = Adactin_File_Read_Manager.getInstance().getInstanceCR().getCCv();
		inputValueElement(pom.getFOP().getCvv(), cCv);
	}

	@Then("^User Click On The Book Now Button And It Navigates To The Hotel Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Hotel_Booking_Confirmation_Page() throws Throwable {

         clickElement(pom.getFOP().getBook());		
	}

	@Then("^User Click On The Booked Itinerary Link And It Navigates To The Booked Itinerary Page$")
	public void user_Click_On_The_Booked_Itinerary_Link_And_It_Navigates_To_The_Booked_Itinerary_Page() throws Throwable {
	  
		clickElement(pom.getFIP().getIter());
	}

	@Then("^User Click On The Logout Button And It Logouts The Page$")
	public void user_Click_On_The_Logout_Button_And_It_Logouts_The_Page() throws Throwable {
	    
		clickElement(pom.getSIP().getLogout());
	}


	

}
