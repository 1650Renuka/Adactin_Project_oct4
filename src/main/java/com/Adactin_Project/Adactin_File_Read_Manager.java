package com.Adactin_Project;

public class Adactin_File_Read_Manager {
	
	public Adactin_File_Read_Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public static Adactin_File_Read_Manager getInstance() {

		Adactin_File_Read_Manager reader = new Adactin_File_Read_Manager();
		return reader;
		
	}
	
	public Adactin_Config_Page getInstanceCR() throws Throwable {

		Adactin_Config_Page reader = new Adactin_Config_Page();
		return reader;
	}

}
