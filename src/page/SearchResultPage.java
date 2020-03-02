package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchResultPage extends MenuPage {

	@FindBy(css = ".filters-toolbar__input.filters-toolbar__input--sort")
	WebElement select;
	@FindBy(css = ".input-group__field.search__input.ui-autocomplete-input.bc-sf-search-box")
	WebElement search;
	@FindBy(css = ".btn.search__submit")
	WebElement submit;

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	// Search products on the navigation button
	public void search(String name) {
		fillText(search, name);
		click(submit);

	}

	// Sort search results
	public void sortProducts(int num) {
		Select selectSort = new Select(select);
		selectSort.selectByIndex(num);
		sleep(3000);
	}

}
