package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MenuPage {

	@FindBy(css = "#CustomerEmail")
	WebElement mail;
	@FindBy(css = "#CustomerPassword")
	WebElement password;
	@FindBy(css = "[value='Sign In']")
	WebElement sighIn;
	@FindBy(css = "#RecoverPassword")
	WebElement forgotPassword;
	@FindBy(css = "#customer_register_link")
	WebElement createAccount;
	@FindBy(css = "#customer_login > div.errors > ul > li")
	WebElement errorMassage;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	// Fill in user information
	public void login(String email, String pass) {
		fillText(mail, email);
		fillText(password, pass);
		click(sighIn);

	}

	public void forgetPassword() {

		click(forgotPassword);

	}

	public void createAccount() {

		click(createAccount);

	}

	// Error message while connecting incorrectly
	public String getErrorMassage() {
		return getText(errorMassage);

	}

}
