package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MenuPage {

	@FindBy(css = ".site-footer__linklist-item>a")
	WebElement contact;

	public HomePage(WebDriver driver) {
		super(driver);

	}

	// Contact the seller
	public void contactUs() {
		click(contact);
	}

}
