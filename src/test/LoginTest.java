package test;

import org.junit.experimental.theories.DataPoint;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.MenuPage;
import page.RobotPage;
import page.HomePage;
import page.LoginPage;

public class LoginTest extends BaseTest1 {

	@Test(dataProvider = "getData", description = "Login with incorrect username and password incorrect")
	public void tc1_loginFailed(String mail, String pass) {

		HomePage hp = new HomePage(driver);
		hp.accout();
		LoginPage lp = new LoginPage(driver);
		lp.login(mail, pass);

		// Verification of message received in incorrect login

		String actual = lp.getErrorMassage();
		String expected = "Incorrect email or password.";
		Assert.assertEquals(actual, expected);
	}

	// Use different data (username and password) in the same script

	@DataProvider
	public Object[][] getData() {
		Object[][] myData = { { "riky@gmail.com", "0527050362" }, { "shimi@gmail.com", "0527040253" },

		};

		return myData;
	}

	@Test(description = "Login with correct username and password")
	public void tc2_loginPasses() {
		HomePage hp = new HomePage(driver);
		hp.accout();
		LoginPage lp = new LoginPage(driver);
		lp.login("leiky9@gmail.com", "0527080568");

	}

}