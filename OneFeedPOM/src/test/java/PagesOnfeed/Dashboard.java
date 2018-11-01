package PagesOnfeed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import UtilsOnFeed.WrapperGenericMethod;

public class Dashboard {
	
	By ClickName = By.xpath("/html/body/div[5]/div[3]/div/div/ul[2]/li[2]/a/span");
	By Logout = By.linkText("Logout");
	
	WrapperGenericMethod Action = new WrapperGenericMethod();
	
public void DoLogOut(WebDriver driver){
	
Action.Click(driver, ClickName);
Action.Click(driver, Logout);
	
}

}



