package PagesOnfeed;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UtilsOnFeed.ExcelUtilsOneFeed;
import UtilsOnFeed.WrapperGenericMethod;

public class SignInPage {

	By LoginSignUpPageLink = By.linkText("Login/Signup");
	By username = By.xpath("//*[@id='signin_form']/div[1]/div");
	By password = By.name("password");
	By SignIn = By.xpath("//*[@id='signin_form']/div[4]/div/input");
	By LogOut = By.xpath("/html/body/div[5]/div[3]/div/div/ul[2]/li[2]/a/span");
	By ErrorMsg = By.xpath("/html/body/div/div[2]/div/div[2]/p");
	WrapperGenericMethod Action = new WrapperGenericMethod();
	ExcelUtilsOneFeed ReadExcel = new ExcelUtilsOneFeed();

	public void CorrectUserNamePassword(WebDriver driver) throws Exception {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Action.Click(driver, LoginSignUpPageLink);

		int ok_size = driver.findElements(By.name("email")).size();

		// System.out.println(ok_size);

		driver.findElements(By.name("email")).get(ok_size - 1).sendKeys("manish.dangas@gmail.com");

		Action.Sendkeys(driver, password, ReadExcel.GetCellData(3, 1));

		Action.Click(driver, SignIn);

	}

	public void WrongUserNamePassword(WebDriver driver) throws Exception {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Action.Click(driver, LoginSignUpPageLink);

		int ok_size = driver.findElements(By.name("email")).size();

		// System.out.println(ok_size);

		driver.findElements(By.name("email")).get(ok_size - 1).sendKeys("manish.dangas1@gmail.com");

		Action.Sendkeys(driver, password, ReadExcel.GetCellData(3, 1));

		Action.Click(driver, SignIn);

		String Error = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/p")).getText();

		// System.out.println(Error);

		Assert.assertEquals("Invalid Credentials!\n"
				+ "Invalid Email or Password You can login using your email associated with your account. Make sure that it is typed correctly.",
				Error);

	}
	
	

}