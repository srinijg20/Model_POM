package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

public class Steps {
	WebDriverManager webDriverManager;
	WebDriver driver;
	CartPage cartPage;
	CheckoutPage checkoutPage;
	HomePage homePage;
	ProductListingPage productListingPage;
	PageObjectManager pageObjectManager;

	@Parameters("browser")
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\srinipriya\\eclipse-workspace\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		homePage.navigateTo_HomePage();
	}

	@When("he searches for {string}")
	public void he_searches_for(String arg1) {
		homePage.perform_Search(arg1);
	}

	@When("choose to buy the first item")
	public void choose_to_buy_the_first_item() {
		productListingPage = pageObjectManager.getProductListingPage();
		productListingPage.select_Product(0);
		productListingPage.clickOn_AddToCart();
	}

	@When("moves to checkout from mini cart")
	public void moves_to_checkout_from_mini_cart() {
		cartPage = pageObjectManager.getCartPage();
		cartPage.clickOn_Cart();
		cartPage.clickOn_ContinueToCheckout();
	}

	@When("enters personal details on checkout page")
	public void enters_personal_details_on_checkout_page() throws InterruptedException {
		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.fill_PersonalDetails();
	}

	@When("select same delivery address")
	public void select_same_delivery_address() throws InterruptedException {
		checkoutPage.check_ShipToDifferentAddress(false);
	}

	@When("selects payment method as {string} payment")
	public void selects_payment_method_as_payment(String string) {
		checkoutPage.select_PaymentMethod("CheckPayment");
	}

	@When("places the order")
	public void places_the_order() {
		checkoutPage.check_TermsAndCondition(true);
		checkoutPage.clickOn_PlaceOrder();
		webDriverManager.quitDriver();
	}
}
