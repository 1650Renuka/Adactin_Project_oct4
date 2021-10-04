package com.Testng.Adactin;

import org.testng.annotations.Test;

public class Testng_Runner {
	
    @Test(priority = -3)
	private void getBrowser() {

		System.out.println("Launch browser");
	}
	
    @Test(priority = -2)
	private void getUrl() {

		System.out.println("URL");
	}
	
   
    @Test
	private void getUsername() {

		System.out.println("Username");
	}
	
    @Test
	private void getPassword() {

		System.out.println("Password");
	}
	
    @Test(priority = 2)
	private void getLocation() {

		System.out.println("Location");
	}
	
    @Test
	private void getHotel() {

		System.out.println("Hotel");
		
	}
	
    @Test
	private void getRoomType() {

		System.out.println("Room Type");
	}
	
    @Test
	private void getRoomNo() {

		System.out.println("Room No");
	}
	
    @Test
	private void getAdult() {

		System.out.println("Adult");
	}
	
    @Test
	private void getChild() {

		System.out.println("Child");
	}
	
    @Test
	private void getFirstName() {

		System.out.println("First Name");
      
	}
	
    @Test
	private void getLastName() {

		System.out.println("Last Name");
		
	}
	
    @Test
	private void getAddress() {

		System.out.println("Address");
	}
	
    @Test
	private void getCCNum() {

		System.out.println("Credit card number");
		
	}
	
    @Test
	private void getCard() {

		System.out.println("Card Type");
		
	}
	
    @Test
	private void getMonth() {

		System.out.println("Month");
	}
	
    @Test
	private void getYear() {

		System.out.println("Year");
		
	}
	
    @Test
	private void getCCv() {

		System.out.println("CCV");
	}
	
	

}
