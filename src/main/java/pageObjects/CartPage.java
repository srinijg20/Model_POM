package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage {
	WebDriver driver;
//	public CartPage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
	@FindBy(how = How.CSS, using = ".cart-button")
	public WebElement btn_Cart;
	@FindBy(how = How.CSS, using = ".checkout-button.alt")
	public WebElement btn_ContinueToCheckout;
//	public void clickOn_Cart() {
//		btn_Cart.click();
//	}
//
//	public void clickOn_ContinueToCheckout() {
//		btn_ContinueToCheckout.click();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//		}
//	}
}