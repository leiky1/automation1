package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends MenuPage {

	@FindBy(css = ".step__footer__previous-link-content")
	WebElement return1;
	@FindBy(css = "#continue_button")
	WebElement continue1;
	@FindBy(css = "#checkout_shipping_rate_id_ups_shipping-03-60_72")
	WebElement shippingMethod1;
	@FindBy(css = "#checkout_shipping_rate_id_ups_shipping-02-75_16")
	WebElement shippingMethod2;
	@FindBy(css = "#checkout_shipping_rate_id_ups_shipping-01-126_43")
	WebElement shippingMethod3;

	public ShippingPage(WebDriver driver) {
		super(driver);
	}

	public void returnInfo() {
		click(return1);
	}

	public void continuePayment() {
		click(continue1);
	}

	// Choice of shipping type
	public void shippingMethod1() {
		sleep(4000);
		click(shippingMethod1);
		click(continue1);
	}

	// Choice of shipping type
	public void shippingMethod2() {
		sleep(4000);
		click(shippingMethod2);
		click(continue1);

	}

	// Choice of shipping type
	public void shippingMethod3() {
		sleep(4000);
		click(shippingMethod3);
		click(continue1);

	}

	public void continueToPayment() {
		sleep(2000);
		click(continue1);
	}

}
