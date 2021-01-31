package CommonFunction;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.LoginPageobject;

public class Loginpage extends CommonFunctions {
	
	@Test
	public void Login()
	{
		
		PageFactory.initElements(driver,LoginPageobject.class);
		LoginPageobject.My_Accounts.click();
		LoginPageobject.Login.click();
		LoginPageobject.Email_id.sendKeys(properties.getProperty("Email_id"));
		LoginPageobject.password.sendKeys(properties.getProperty("password"));
		LoginPageobject.submit_Btn.click();
		
		
	}
	
	
	

}
