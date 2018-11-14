package test;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesOnWittyFeedTv.Dashboard;
import UtilsOnFeed.ReadPropertiesFileWittyTv;

public class TestCaseDashboardToVerifyImageAndContentTest {

	static Properties properties = null;

	WebDriver driver = new ChromeDriver();

	//String st = System.setProperty("webdriver.chrome.driver", "chromedriver");
	String st = System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	Dashboard DashboardItem = new Dashboard();

	@BeforeTest
	public void OpenBrowser() throws IOException {

		ReadPropertiesFileWittyTv readConfigFile = new ReadPropertiesFileWittyTv();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void CheckFeaturedPostDashboard() throws Exception {
		DashboardItem.FeaturedPostDashboard(driver);

	}

	@Test(priority = 2)

	public void CheckSecondPostDashboard() {

		DashboardItem.SecondPostDashboard(driver);
	}

	@Test(priority = 3)

	public void CheckThirdPostDashboard() {

		DashboardItem.ThirdPostDashboard(driver);
	}
}
