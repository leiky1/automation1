package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {

	@FindBy(css = ".search-header.search>[name='q']")
	WebElement search;
	@FindBy(css = ".search-header__submit.search__submit.btn--link")
	WebElement btnSearch;
	@FindBy(css = ".site-header__account")
	WebElement account;
	@FindBy(css = ".icon.icon-cart")
	WebElement cart;
	@FindBy(css = ".site-header__logo-image>img")
	WebElement homePage;
	@FindBy(css = "#SiteNav > li:nth-child(3) > a")
	WebElement about;
	@FindBy(css = "#SiteNav > li:nth-child(2) > a")
	WebElement stores;
	@FindBy(css = "#SiteNav > li.site-nav--has-dropdown > a")
	WebElement shope;
	@FindBy(css = "#SiteNavLabel-shop > ul > li:nth-child(1) > a")
	WebElement Trionfo;
	@FindBy(css = "#SiteNavLabel-shop > ul > li:nth-child(2) > a")
	WebElement Classico;
	@FindBy(css = "#SiteNavLabel-shop > ul > li:nth-child(3) > a")
	WebElement Angelo;
	@FindBy(css = "#SiteNavLabel-shop > ul > li:nth-child(4) > a")
	WebElement Torino;

	public MenuPage(WebDriver driver) {
		super(driver);

	}

	public void search(String name) {
		click(search);
		fillText(search, name);
		sleep(2000);
		click(btnSearch);
		sleep(1000);

	}

	public void cart() {
		click(cart);
	}

	public void accout() {
		click(account);

	}

	public void about() {
		click(about);

	}

	public void stores() {
		click(stores);

	}

	public void Trionfo() {
		click(shope);
		click(Trionfo);
	}

	public void Classico() {
		click(shope);
		click(Classico);
	}

	public void Angelo() {
		click(shope);
		click(Angelo);
	}

	public void Torino() {
		click(shope);
		click(Torino);
	}

}
