package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RobotPage extends MenuPage {

	@FindBy(css = "#recaptcha-anchor")
	WebElement robot;
	@FindBy(css = "[value='Submit']")
	WebElement submit;

	public RobotPage(WebDriver driver) {
		super(driver);

	}

	public void robot() {
		sleep(6000);
		click(robot);
		sleep(6000);
		click(submit);
	}

}
