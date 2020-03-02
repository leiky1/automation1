package test;

import org.testng.annotations.Test;
import page.HomePage;
import page.SearchResultPage;

public class SearchTest extends BaseTest1 {

	@Test(description = "Search products in the navigation bar")
	public void tc1_searchProduct() {
		HomePage hp = new HomePage(driver);
		hp.search("black");
	}

	@Test(description = "Search and sort products")
	public void tc2_searchProduct() {

		// Product search on the search page and product filtering

		SearchResultPage sp = new SearchResultPage(driver);
		sp.search("torino");
		sp.sortProducts(4);
	}

}
