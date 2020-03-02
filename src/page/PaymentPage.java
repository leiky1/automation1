package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends MenuPage {

	@FindBy(css = ".step__footer__previous-link-content")
	WebElement return1;
	@FindBy(css = "#checkout_payment_gateway_123810705")
	WebElement creditCard;
	@FindBy(css = "body > div > div > div > main > div.step > div > form > div.section.section--payment-method > div.section__content > div:nth-child(2) > div > p")
	WebElement errorMassage;
	@FindBy(css = ".shown-if-js>.step__footer__continue-btn.btn")
	WebElement payNow;

	public PaymentPage(WebDriver driver) {
		super(driver);
	}

	public void returnToShipping() {
		click(return1);
	}

	public void paypal() {
		click(creditCard);
		sleep(1000);
	}

	public void payNow() {
		sleep(3000);
		click(payNow);
		sleep(3000);
	}

	// Error message when payment is incorrect
	public String getErrorMassage() {
		return getText(errorMassage);

	}

}
