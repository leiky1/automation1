package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HatPage extends BasePage {

	@FindBy(css = "#AddToCart-product-alternate")
	WebElement addCart;
	@FindBy(css = "#SingleOptionSelector-0")
	WebElement selectSize;
	@FindBy(css = "#AddToCartText-product-template")
	WebElement addCart1;

	public HatPage(WebDriver driver) {
		super(driver);

	}

	//Select the product size and move to the shopping cart
	public void goToCart(String num) {

		Select selectSort = new Select(selectSize);
		selectSort.selectByVisibleText(num);
		click(addCart);
	}

	public void goToCart1(String num) {

		Select selectSort = new Select(selectSize);
		selectSort.selectByVisibleText(num);
		click(addCart1);
	}

}
