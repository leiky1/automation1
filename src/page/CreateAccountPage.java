package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends MenuPage {

	@FindBy(css = "#FirstName")
	WebElement firstName;
	@FindBy(css = "#LastName")
	WebElement lastName;
	@FindBy(css = "#Email")
	WebElement mail;
	@FindBy(css = "#CreatePassword")
	WebElement pass;
	@FindBy(css = ".btn")
	WebElement submit;

	public CreateAccountPage(WebDriver driver) {
		super(driver);

	}

	// Fill in details when creating an account
	public void createAccount(String first, String last, String email, String password) {
		fillText(firstName, first);
		fillText(lastName, last);
		fillText(mail, email);
		fillText(pass, password);
		click(submit);

	}

}
