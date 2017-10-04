package com.aet.placepassadmin.test;


import com.aet.placepassadmin.scenarios.LoginNegativeScenarios;
import com.aet.placepassadmin.scenarios.LoginPositiveScenarios;

import java.sql.Driver;

import com.aet.placepassadmin.pageobjects.LoginPage;


public class TestRun {
	//static LoginPage loginpg = new LoginPage();
	private static LoginPositiveScenarios lp = new LoginPositiveScenarios();
	
	public static void main(String args[]) {	
		
		//Login positive scenarios
		lp.loginSuperAdminValidScenario();
		lp.loginAdminUserValidScenario();
	
	
		//Login Negative scenarios
		
		//if(loginpg.getUsername() != "placepass@aetrunum.com" && loginpg.getPassword() !="Asdf123$"){
		/*
		LoginNegativeScenarios.loginInvalidUsername();
		LoginNegativeScenarios.loginInvalidPassword();
		LoginNegativeScenarios.loginBlankUsername();
		LoginNegativeScenarios.loginBlankPassword();
		*/
		
		
	}
}
