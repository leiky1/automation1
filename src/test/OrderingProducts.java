package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.CartPage;
import page.ContactInfoPage;
import page.HatPage;
import page.HomePage;
import page.LoginPage;
import page.PaymentPage;
import page.ShippingPage;
import page.ShopPage;

public class OrderingProducts extends BaseTest1 {

	@Test(description = "Order a product without login until payment")
	public void tc1_order() {
		HomePage hp = new HomePage(driver);
		hp.Classico();
		ShopPage cp = new ShopPage(driver);
		cp.chooseHat();
		HatPage hpp = new HatPage(driver);
		hpp.goToCart("58");
		CartPage cpp = new CartPage(driver);
		cpp.addNote("Thank you for your convenient purchase");
		cpp.chechout();
		ContactInfoPage cap = new ContactInfoPage(driver);
		cap.contactInfo("noam@gmail.com", "lea", "valess", "nis", "Nikiski", "+986664532", "99639");
		cap.state(2);
		ShippingPage shp = new ShippingPage(driver);
		shp.shippingMethod2();
		shp.continuePayment();
		PaymentPage ph = new PaymentPage(driver);
		ph.sleep(1000);
		ph.payNow();
		ph.sleep(1000);

		// Verification that the order was successful until the payment stage
		// The error message says the payment information is correct

		String actual = ph.getErrorMassage();

		String expected = "Your payment details couldn’t be verified. Check your card details and try again.";

		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Order a product with an account login until payment")
	public void tc2_order() {

		PaymentPage ph = new PaymentPage(driver);
		ph.returnToShipping();
		ShippingPage shp = new ShippingPage(driver);
		shp.returnInfo();
		ContactInfoPage cap = new ContactInfoPage(driver);
		// Login to account
		cap.login();
		LoginPage lp = new LoginPage(driver);
		lp.login("leiky9@gmail.com", "0527080568");
		cap.continueToShipping();
		shp.shippingMethod3();
		ph.payNow();

		// Verification that the order was successful until the payment stage
		// The error message says the payment information is correct

		String actual = ph.getErrorMassage();

		String expected = "Your payment details couldn’t be verified. Check your card details and try again.";

		Assert.assertEquals(actual, expected);

	}

}
