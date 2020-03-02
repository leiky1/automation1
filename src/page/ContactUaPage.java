package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUaPage extends MenuPage {

	@FindBy(css = "#ContactFormName")
	WebElement name;
	@FindBy(css = "#ContactFormEmail")
	WebElement email;
	@FindBy(css = "#ContactFormPhone")
	WebElement phone;
	@FindBy(css = "#ContactFormMessage")
	WebElement massage;
	@FindBy(css = ".btn")
	WebElement send;
	@FindBy(css = ".note form-success")
	WebElement Massage;

	public ContactUaPage(WebDriver driver) {
		super(driver);
	}

	// Fill in customer information and message to seller
	public void contact(String name1, String mail, String phone1, String massage1) {
		fillText(name, name1);
		fillText(email, mail);
		fillText(phone, phone1);
		fillText(massage, massage1);
		click(send);
	}

	// Receive a message that the message was successfully sent
	public String Massage() {
		return getText(Massage);

	}

}
