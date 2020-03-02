package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactInfoPage extends MenuPage {

	@FindBy(css = "#checkout_shipping_address_first_name")
	WebElement firstName;
	@FindBy(css = "#checkout_shipping_address_last_name")
	WebElement lastName;
	@FindBy(css = "#checkout_shipping_address_address1")
	WebElement address1;
	@FindBy(css = "#checkout_shipping_address_city")
	WebElement city1;
	@FindBy(css = "#checkout_shipping_address_phone")
	WebElement phone1;
	@FindBy(css = "#continue_button")
	WebElement shipping;
	@FindBy(css = ".step__footer__previous-link-content")
	WebElement return1;
	@FindBy(css = "#checkout_shipping_address_province")
	WebElement selectState1;
	@FindBy(css = "#checkout_shipping_address_zip")
	WebElement zip;
	@FindBy(css = "#checkout_email")
	WebElement email;
	@FindBy(css = "body > div.content > div > div > main > div.step > form > div.step__sections > div.section.section--contact-information > div.section__header > div > p > a")
	WebElement login;
	@FindBy(css = "#checkout_shipping_address_country")
	WebElement country;

	public ContactInfoPage(WebDriver driver) {
		super(driver);
	}

	public void returnToCart() {
		click(return1);
	}

	// Fill in customer information
	public void contactInfo(String email1, String first, String last, String address, String city, String phone,
			String zip1) {
		fillText(email, email1);
		fillText(firstName, first);
		fillText(lastName, last);
		fillText(address1, address);
		fillText(city1, city);
		fillText(phone1, phone);
		fillText(zip, zip1);
		sleep(2000);

	}

	// Select an area from the list
	public void state(int state2) {
		Select selectState = new Select(selectState1);
		selectState.selectByIndex(state2);
		click(shipping);
		sleep(2000);

	}

	// Select a country from the list
	public void country(String num) {
		Select selectcountry = new Select(country);
		selectcountry.deselectByVisibleText(num);
		sleep(1000);

	}

	// Login to account
	public void login() {
		click(login);
	}

	// Back to the shopping page
	public void continueToShipping() {
		click(shipping);
	}
}
