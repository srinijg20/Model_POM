package stepDefinitions;

import org.testng.annotations.Parameters;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
	TestContext testContext;
	HomePage homePage;

	public HomePageSteps(TestContext testcontext) {
		testContext = testcontext;
		homePage = testContext.getPageObjectManager().getHomePage();
	}

	@Parameters("browser")
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\srinipriya\\eclipse-workspace\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		homePage.navigateTo_HomePage();
	}

	@When("he searches for {string}")
	public void he_searches_for(String arg1) {
		homePage.perform_Search(arg1);
	}
}
