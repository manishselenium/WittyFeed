package test;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PagesOnWittyFeedTv.Dashboard;
import PagesOnWittyFeedTv.PostDetails;
import UtilsOnFeed.ReadPropertiesFileWittyTv;

public class TestCasesOfLatestPostDetailsTest {

	static Properties properties = null;

	WebDriver driver = new ChromeDriver();

	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

	Dashboard DashboardItem = new Dashboard();

	PostDetails Details = new PostDetails();

	@BeforeTest
	public void OpenBrowser() throws IOException {

		ReadPropertiesFileWittyTv readConfigFile = new ReadPropertiesFileWittyTv();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		DashboardItem.ClickThirdPost(driver);

	}

	@Test(priority = 1)
	public void CheckImageOnLatestPostDetailsPage() throws Exception {

		Details.PostDetailsImageCheck(driver);
	}

	@Test(priority = 2)
	public void CheckHeaderOnLatestPostDetailsPage() throws Exception {

		Details.PostDetailsHeaderContentCheck(driver);
	}

	@Test(priority = 3)
	public void CheckParagraphOnLatestPostDetailsPage() throws Exception {

		Details.PostDetailsParagraphCheck(driver);
	}

}
