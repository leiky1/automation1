package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends MenuPage {

	@FindBy(css = ".btn.btn--has-icon-after.cart__continue-btn")
	WebElement continueShopping;
	@FindBy(css = ".btn.btn--small.btn--secondary.cart__remove")
	WebElement remove;
	@FindBy(css = ".btn.btn--secondary.cart__update.cart__continue--large.small--hide")
	WebElement continue1;
	@FindBy(css = "[name='checkout']")
	WebElement chechout;
	@FindBy(css = "#CartSpecialInstructions")
	WebElement note;

	public CartPage(WebDriver driver) {
		super(driver);

	}

	// Back to the shopping page
	public void continueShopping() {
		click(continueShopping);
	}

	// Removing a product from the shopping cart
	public void removeProduct() {
		click(remove);
	}

	// Back to the shopping page
	public void continueShopping1() {
		click(continue1);
	}

	// Beyond continuing to buy
	public void chechout() {
		click(chechout);
	}

	// Add a message to the seller
	public void addNote(String text) {
		fillText(note, text);
	}

}
