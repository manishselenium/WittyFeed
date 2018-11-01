package test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesOnfeed.Dashboard;
import PagesOnfeed.SignInPage;
import UtilsOnFeed.ReadPropertiesFileOneFeed;

public class TestCasesSignInOneFeedTest {

	static Properties properties = null;

	WebDriver driver = new ChromeDriver();

	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

	SignInPage LoginPageObj = new SignInPage();

	@BeforeTest
	public void OpenBrowser() throws IOException {

		ReadPropertiesFileOneFeed readConfigFile = new ReadPropertiesFileOneFeed();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void LoginWithCorrectCredentials() throws Exception {
		LoginPageObj.CorrectUserNamePassword(driver);

	}

	@Test(priority = 2)

	public void LogOut() {

		Dashboard signout = new Dashboard();
		signout.DoLogOut(driver);

	}

	@Test(priority = 3)
	public void WrongLogin() throws Exception {

		LoginPageObj.WrongUserNamePassword(driver);

	}

}
