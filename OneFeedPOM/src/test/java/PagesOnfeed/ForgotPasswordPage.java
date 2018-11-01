package PagesOnfeed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class ForgotPasswordPage {

	By ForgotLink = By.linkText("Forgot Password?");
	By LoginSignUpPageLink = By.linkText("Login/Signup");
	By InputField = By.xpath("//input[@type='email']");
	By InputText = By.xpath("//input[@type='submit']");
	By ErrorMsg = By.xpath("/html/body/div/div[2]/div/div/h4[1]");
	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ForgotPassUsingRegisterdEmail(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Action.Click(driver, LoginSignUpPageLink);
		Action.Click(driver, ForgotLink);
		Action.Sendkeys(driver, InputField, "manish.dangas@gmail.com");
		Action.Click(driver, InputText);
		String Currenturl = driver.getCurrentUrl();
		System.out.println(Currenturl);
		Assert.assertEquals("http://www.onefeed.ai/landing_page/forgot_password", Currenturl);

	}

	public void ForgotPassUsingNonRegisterdEmail(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.onefeed.ai/");
		Action.Click(driver, LoginSignUpPageLink);
		Action.Click(driver, ForgotLink);
		Action.Sendkeys(driver, InputField, "manish.dangas12@gmail.com");
		Action.Click(driver, InputText);
		String error = driver.findElement(ErrorMsg).getText();

		Assert.assertEquals("Invalid Email!", error);

	}
}
