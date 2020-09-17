package pageMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.CartPage;

public class CartPageMethods {
	WebDriver driver;

	public CartPageMethods(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, CartPage.class);
	}

	CartPage cart = new CartPage();

	public void clickOn_Cart() {
		cart.btn_Cart.click();
	}

	public void clickOn_ContinueToCheckout() {
		cart.btn_ContinueToCheckout.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
	}
}
