package PagesOnfeed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import UtilsOnFeed.ExcelUtilsOneFeed;
import UtilsOnFeed.WrapperGenericMethod;

public class SignUpPage {

	By LoginSignUpPageLink = By.linkText("Login/Signup");
	By SignUpPageLink = By.linkText("Sign Up");
	By FullName = By.name("signup_name");
	By SelectCountry = By.id("Countries_list");
	By StoreUrl = By.id("store_url");
	By Email = By.id("signup_email");
	By Password = By.id("signup_pwd");
	By SignUpButton = By.xpath("//*[@id='signup_form']/div[6]/div/input");
	By AssertTextForExistingUser = By.xpath("//*[@id='signup_message']");
	WrapperGenericMethod Action = new WrapperGenericMethod();
	ExcelUtilsOneFeed ReadFromExcel = new ExcelUtilsOneFeed();

	public void DoSignUpNew(WebDriver driver) throws Exception {

		Action.Click(driver, LoginSignUpPageLink);
		Action.Click(driver, SignUpPageLink);
		Action.Sendkeys(driver, FullName, ReadFromExcel.GetCellData(7, 1));
		Select drpCountry = new Select(driver.findElement(SelectCountry));
		drpCountry.selectByVisibleText("INDIA");
		Action.Sendkeys(driver, StoreUrl, ReadFromExcel.GetCellData(8, 1));
		Action.Sendkeys(driver, Email, ReadFromExcel.GetCellData(9, 1));
		Action.Sendkeys(driver, Password, ReadFromExcel.GetCellData(10, 1));
		Action.Click(driver, SignUpButton);
		Thread.sleep(3000);
		String CurrentUrl = driver.getCurrentUrl();
		Assert.assertEquals(CurrentUrl, "http://www.onefeed.ai/landing_page/not_active");

	}

	public void DoSignUpExistingEmail(WebDriver driver) throws Exception {

		driver.get("http://www.onefeed.ai/");
		Action.Click(driver, LoginSignUpPageLink);
		Action.Click(driver, SignUpPageLink);
		Action.Sendkeys(driver, FullName, ReadFromExcel.GetCellData(7, 1));
		Select drpCountry = new Select(driver.findElement(SelectCountry));
		drpCountry.selectByVisibleText("INDIA");
		Action.Sendkeys(driver, StoreUrl, ReadFromExcel.GetCellData(8, 1));
		Action.Sendkeys(driver, Email, ReadFromExcel.GetCellData(9, 1));
		Action.Sendkeys(driver, Password, ReadFromExcel.GetCellData(10, 1));
		Action.Click(driver, SignUpButton);
		Thread.sleep(2000);
		String message = driver.findElement(By.xpath("//span[@id='signup_message']")).getText();
		System.out.println(message);
		Assert.assertEquals(message, "Email you entered already exists. Please Sign Up with another email.");

	}

}
