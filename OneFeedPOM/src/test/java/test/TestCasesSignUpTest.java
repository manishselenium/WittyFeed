package test;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesOnfeed.SignUpPage;
import UtilsOnFeed.ReadPropertiesFileOneFeed;

public class TestCasesSignUpTest {

	SignUpPage SignUp = new SignUpPage();

	static Properties properties = null;

	WebDriver driver = new ChromeDriver();

	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

	@BeforeTest
	public void OpenBrowser() throws IOException {

		ReadPropertiesFileOneFeed readConfigFile = new ReadPropertiesFileOneFeed();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void DoNew_SignUp() throws Exception {

		SignUp.DoSignUpNew(driver);
	}


}
