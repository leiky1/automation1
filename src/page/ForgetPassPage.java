package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPassPage extends MenuPage {

	@FindBy(css = "#RecoverEmail")
	WebElement mail;
	@FindBy(css = "p>.btn")
	WebElement submit;
	@FindBy(css = "#HideRecoverPasswordLink")
	WebElement cancel;

	public ForgetPassPage(WebDriver driver) {
		super(driver);

	}

	public void resetPassword(String email) {
		fillText(mail, email);
		click(submit);
	}

	public void cencel() {
		click(cancel);
	}

}
