  package com.aet.placepassadmin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aet.placepassadmin.setup.SetUp;

public class LoginPage extends SetUp {

	//To identify and assign values to elements in Login Page
	private WebElement txtUserName;
	
	private WebElement txtPassword;
	
	private WebElement txtLogin;
	
	private String username;
	
	private String password;
	
	private WebElement errorMessage;
	
	//Getters and Setters for variables created above
	
	/*public WebElement getTxtUserName() {
		return txtUserName;
	}*/

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public void seterrorMessage(String errorMessage) {
		identifyErrorMessage().sendKeys(errorMessage);
	}


	public void setTxtUserName(WebElement txtUserName) {
		this.txtUserName = txtUserName;
	}

	/*public WebElement getTxtPassword() {
		return txtPassword;
	}*/

	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		identifyUserName().sendKeys(username);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		identifyPassword().sendKeys(password);
	}

	public WebElement getTxtLogin() {
		return txtLogin;
	}
	
	public void setTxtLogin(WebElement txtLogin) {
		this.txtLogin = txtLogin;
	}
	//=========================================================
	private static WebElement identifyUserName() {
		return SetUp.getDriver().findElement(By.id("username"));
	}

	private static WebElement identifyPassword() {
		return SetUp.getDriver().findElement(By.id("password"));
	}

	private static WebElement identifyLoginbtn() {
		return SetUp.getDriver().findElement(By.xpath("//button[@class='btn btn-block btn-primary'][contains(text(),'Login')]"));
	}
	
	private static WebElement identifyErrorMessage(){
		return SetUp.getDriver().findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/span[contains(text(),'Username and password don't match')]"));
		
	}
	
	//login click
	public  void click_Login(){
			identifyLoginbtn().click();
		}
	
	

	

}
