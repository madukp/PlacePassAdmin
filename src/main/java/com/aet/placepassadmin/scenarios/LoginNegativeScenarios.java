package com.aet.placepassadmin.scenarios;

import com.aet.placepassadmin.pageobjects.LoginPage;
import com.aet.placepassadmin.setup.SetUp;

import junit.framework.Assert;

public class LoginNegativeScenarios {

	static LoginPage loginpg = new LoginPage();
	
	public static void loginInvalidUsername() {
		SetUp.setup();
		loginpg.setUsername("abc@aeturnum.com");
		loginpg.setPassword("Asdf123$");
		loginpg.click_Login();
		SetUp.driverQuit();
	}

	public static void loginInvalidPassword() {
		SetUp.setup();
		loginpg.setUsername("placepass@aeturnum.com");
		loginpg.setPassword("abc123$");
		loginpg.click_Login();
		SetUp.driverQuit();
	}
	
	public static void loginBlankUsername(){
		SetUp.setup();
		loginpg.setUsername(" ");
		loginpg.setPassword("Asdf123$");
		loginpg.click_Login();
		SetUp.driverQuit();
			
	}
	
	public static void loginBlankPassword(){
		SetUp.setup();
		loginpg.setUsername("placepass@aeturnum.com");
		loginpg.setPassword(" ");
		loginpg.click_Login();
		SetUp.driverQuit();
		
	}
	
	private static void checkInvalidScenarios(String username, String password) {
		
		/*switch (credentials) {
		case("placepass@aeturnum,com" && "Asdf123$"):
			System.out.println(" ");
			break;
		case "red":
			System.out.println(" ");
			break;
		default:
			System.out.println("  ");
		}*/
		
		if(username=="abc@aeturnum.com" && password=="Asdf123$")
		{
			 Assert.assertEquals("Username and password don't match", loginpg.getErrorMessage());
			 System.out.println("Success");
		}
		
	}
	
	

	
}
