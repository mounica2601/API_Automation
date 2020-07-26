package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	
	LoginPage loginPage;
	
	@BeforeTest
	public void setUp() {
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginTest() {
		loginPage.loginTest();
	}
}
