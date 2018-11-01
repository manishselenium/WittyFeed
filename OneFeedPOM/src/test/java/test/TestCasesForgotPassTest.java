package test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesOnfeed.Dashboard;
import PagesOnfeed.ForgotPasswordPage;
import PagesOnfeed.SignInPage;
import UtilsOnFeed.ReadPropertiesFileOneFeed;

public class TestCasesForgotPassTest {

	static Properties properties = null;

	WebDriver driver = new ChromeDriver();

	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

	ForgotPasswordPage forgotPass = new ForgotPasswordPage();

	@BeforeTest
	public void OpenBrowser() throws IOException {

		ReadPropertiesFileOneFeed readConfigFile = new ReadPropertiesFileOneFeed();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void ForGotPassUsingRegEmail() throws Exception {
		forgotPass.ForgotPassUsingRegisterdEmail(driver);

	}

	@Test(priority = 2)

	public void ForGotPassUsingNonRegEmail() {

		forgotPass.ForgotPassUsingNonRegisterdEmail(driver);
	}

}
