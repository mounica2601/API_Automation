package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import pages.LoginPage;
import pages.UsersPage;

public class UsersTest {
	
	LoginPage loginPage;
	UsersPage usersPage;
	String token;
	
	@BeforeTest
	public void setUp() {
		loginPage = new LoginPage();
		Response res = loginPage.loginTest();
		token = res.asString();
		usersPage = new UsersPage();
	}
	
	@Test()
	public void testGetUsers() {
		usersPage.getUsers(token);
	}
}
