package com.Adactin_Project;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Adactin_Config_Page {
	
	public static Properties p;
	
	public Adactin_Config_Page() throws Throwable {

		File f = new File("C:\\Users\\RENUKA\\eclipse-workspace\\Adactin_Project\\src\\main\\java\\com\\Adactin_Property\\configure.properties");
        FileInputStream fis = new FileInputStream(f);
        p = new Properties();
        p.load(fis);
	
	}
	
	public String getBrowser() {

		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {

		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {

		String username = p.getProperty("db_Username");
		return username;
	}
	
	public String getPassword() {

		String pass = p.getProperty("db_Password");
	    return pass;
	}
	
	public String getLocation() {

		String loc = p.getProperty("db_Location");
		return loc;
	}
	
	public String getHotel() {

		String hotel = p.getProperty("db_Hotel");
		return hotel;
	}
	
	public String getRoomType() {

		String room = p.getProperty("db_Room_Type");
		return room;
	}
	
	public String getRoomNo() {

		String room_no = p.getProperty("db_Room_No");
		return room_no;
	}
	
	public String getAdult() {

		String adult = p.getProperty("db_Adult");
		return adult;
	}
	
	public String getChild() {

		String child = p.getProperty("db_Child");
		return child;
	}
	
	public String getFirstName() {

        String fname = p.getProperty("db_FirstName");
	    return fname;
	}
	
	public String getLastName() {

		String lname = p.getProperty("db_LastName");
		return lname;
	}
	
	public String getAddress() {

		String address = p.getProperty("db_Address");
		return address;
	}
	
	public String getCCNum() {

		String ccNum = p.getProperty("db_CC_Num");
		return ccNum;
	}
	
	public String getCard() {

		String card = p.getProperty("db_CardType");
		return card;
	}
	
	public String getMonth() {

		String month = p.getProperty("db_Month");
		return month;
	}
	
	public String getYear() {

		String year = p.getProperty("db_Year");
		return year;
	}
	
	public String getCCv() {

		String ccv = p.getProperty("db_CCV");
		return ccv;
	}
	
	

}
