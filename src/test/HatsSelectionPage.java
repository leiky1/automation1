package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.ShopPage;
import page.CartPage;
import page.HatPage;
import page.HomePage;
import page.LoginPage;

public class HatsSelectionPage extends BaseTest1 {

	@Test(description = "Add two different hats to the cart")
	public void tc1_AddingProducts() {
		//Choose two products from different categories by size and color and add to cart
		HomePage hp = new HomePage(driver);
		hp.Classico();
		ShopPage cp = new ShopPage(driver);
		cp.chooseHat();
		HatPage hpp = new HatPage(driver);
		hpp.goToCart("60");
		hp.Torino();
		cp.chooseHat1();
		hpp.goToCart1("56");

	}

	@Test(description = "Remove all products from the cart")
	public void tc2_ProductRemoval() {
		//Removes the selected products in the previous test
		CartPage cp = new CartPage(driver);
		cp.removeProduct();
		cp.removeProduct();

	}

}
