package UtilsOnFeed;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WrapperGenericMethod {

	public void Click(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(by).click();
	}

	public void Sendkeys(WebDriver driver, By by, String key) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(by).sendKeys(key);
	}

	public String NoAction(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String Obj = driver.findElement(by).getAttribute("name");

		return Obj;

	}

	public String GetText(WebDriver driver, By by) {

		String Text = driver.findElement(by).getText();

		return Text;
	}

	public void Clear(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(by).clear();
	}
	
	
}
