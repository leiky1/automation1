package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends MenuPage {

	@FindBy(css = "#collectionsclassicoproducts390314-1 > div > a > div.grid-view-item__image-container.bc-al-overlay")
	WebElement hat1;
	@FindBy(css = "#collectionstorinoproducts930252-1 > div > a > div.grid-view-item__image-container.bc-al-overlay")
	WebElement hat2;

	public ShopPage(WebDriver driver) {
		super(driver);

	}

	public void chooseHat() {
		click(hat1);
	}

	public void chooseHat1() {
		click(hat2);
	}

}
