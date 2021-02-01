package TestCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.Commonfunction;
import PageObject.LoginPageObject;


public class Login_page extends Commonfunction {
@Test
	public void Login()
	{
		PageFactory.initElements(driver,LoginPageObject.class);
		Actions act=new Actions(driver);
		act.moveToElement(LoginPageObject.My_Accounts).build().perform();
		act.moveToElement(LoginPageObject.login).click().build().perform();
		LoginPageObject.username.sendKeys(properties.getProperty("Name"));
		LoginPageObject.password.sendKeys(properties.getProperty("password"));
		LoginPageObject.submit.click();
		
		
		
	}
}
