package com.aet.placepassadmin.scenarios;

import org.junit.Test;

import com.aet.placepassadmin.pageobjects.LoginPage;
import com.aet.placepassadmin.setup.SetUp;

public class LoginPositiveScenarios extends SetUp{

	LoginPage loginpg = new LoginPage();

	@Test
	public void loginSuperAdminValidScenario() {

		setup();
		loginpg.setUsername("placepass@aeturnum.com");
		loginpg.setPassword("Asdf123$");
		loginpg.click_Login();
		driverQuit();
	}
	
	@Test
	public void loginAdminUserValidScenario() {

		setup();
		loginpg.setUsername("thula.perera+abcd@gmail.com");
		loginpg.setPassword("TT@aeturnum");
		loginpg.click_Login();
		driverQuit();
	}

}
