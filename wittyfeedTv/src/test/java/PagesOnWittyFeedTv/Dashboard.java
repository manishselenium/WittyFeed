package PagesOnWittyFeedTv;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import UtilsOnFeed.WrapperGenericMethod;

public class Dashboard {
	
	By FeaturedPostImage = By.xpath("/html/body/app-root/app-home/div/div/div[1]/a/div");
	By SecondPostImage = By.xpath("/html/body/app-root/app-home/div/div/div[2]/a/div");
	By ThirdPostImage = By.xpath("/html/body/app-root/app-home/div/div/div[3]/a/div");
	By FeaturedPostContent = By.xpath("/html/body/app-root/app-home/div/div/div[1]/h1/a");
	By SecondPostContent = By.xpath("/html/body/app-root/app-home/div/div/div[2]/h1/a");
	By ThirdPostContent = By.xpath("/html/body/app-root/app-home/div/div/div[3]/h1/a");
	By LatestStoryImage = By.xpath("/html/body/app-root/app-home/div/div/div[5]/section/div/div/div/div[1]/div/a/div");
	By LatestStoryContent = By.xpath("/html/body/app-root/app-home/div/div/div[5]/section/div/div/div/div[1]/div/p[1]/a");
	
	
WrapperGenericMethod Action = new WrapperGenericMethod();

	
public void FeaturedPostDashboard(WebDriver driver){
	
int ImageSize = driver.findElements(FeaturedPostImage).size();
Assert.assertEquals(1, ImageSize);

int ContentSize = driver.findElements(FeaturedPostContent).size();
Assert.assertEquals(1, ContentSize);
}

public void SecondPostDashboard(WebDriver driver)
{
	int ImageSize = driver.findElements(SecondPostImage).size();
	Assert.assertEquals(1, ImageSize);

	int ContentSize = driver.findElements(SecondPostContent).size();
	Assert.assertEquals(1, ContentSize);
	
}
public void ThirdPostDashboard(WebDriver driver)
{
	int ImageSize = driver.findElements(ThirdPostImage).size();
	Assert.assertEquals(1, ImageSize);

	int ContentSize = driver.findElements(ThirdPostContent).size();
	Assert.assertEquals(1, ContentSize);
	
}

public void LatestStoryDashboard(WebDriver driver)
{
	int ImageSize = driver.findElements(LatestStoryImage).size();
	Assert.assertEquals(1, ImageSize);

	int ContentSize = driver.findElements(LatestStoryContent).size();
	Assert.assertEquals(1, ContentSize);
	}

public void ClickFeaturedPost(WebDriver driver) {
	
Action.Click(driver, FeaturedPostImage);

}

public void ClickSecondPost(WebDriver driver) {
	
Action.Click(driver, SecondPostImage);

}

public void ClickThirdPost(WebDriver driver) {
	
Action.Click(driver, ThirdPostImage);

}

public void ClickLatestPost(WebDriver driver) {
	
Action.Click(driver, LatestStoryImage);

}
}



