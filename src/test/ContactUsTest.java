package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.ContactUaPage;
import page.HomePage;

public class ContactUsTest extends BaseTest1 {

	@Test(description = "Send a message to the seller")
	public void contactUs() {
		HomePage hp = new HomePage(driver);
		hp.contactUs();
		ContactUaPage cp = new ContactUaPage(driver);
		cp.contact("lea", "kal@gmail.com", "836-926-0122", "Do you have a store in Brooklyn?");
		cp.sleep(3000);
		
		//Verification that the message has been successfully sent to the seller and the message is received correctly

		String expected = "Thanks for contacting us. We'll get back to you as soon as possible.";
		String actual = cp.Massage();

		Assert.assertEquals(actual, expected);

	}

}
