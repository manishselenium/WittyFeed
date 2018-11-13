package PagesOnWittyFeedTv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PostDetails {

	By ImageElement = By.xpath("/html/body/app-root/app-story/div[1]/div[1]/div[1]/div[1]");
	By HeaderContentElement = By.xpath("/html/body/app-root/app-story/div[1]/div[1]/div[2]/div[1]/div/h1");
	By ParagraphContentElement = By.xpath("/html/body/app-root/app-story/div[1]/div[1]/div[2]/div[6]/p[1]");

	public void PostDetailsImageCheck(WebDriver driver) {

		int PostImage = driver.findElements(ImageElement).size();
		Assert.assertEquals(1, PostImage);
	}

	public void PostDetailsHeaderContentCheck(WebDriver driver) {
		int PostHeaderContent = driver.findElements(HeaderContentElement).size();
		Assert.assertEquals(1, PostHeaderContent);
	}

	public void PostDetailsParagraphCheck(WebDriver driver) {
		int ParagraphContent = driver.findElements(ParagraphContentElement).size();
		Assert.assertEquals(1, ParagraphContent);

	}
}
