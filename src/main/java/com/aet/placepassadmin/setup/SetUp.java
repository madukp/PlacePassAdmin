package com.aet.placepassadmin.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {

	private static WebDriver driver;

	public static void setup() {

		String path = ".\\src\\resources\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
		driver.get("https://admin-qa.placepass.com/#/login/");
		System.out.println("Application title is Placepass" + driver.getTitle());
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static  void driverQuit(){
		driver.quit();
	}
	
}
