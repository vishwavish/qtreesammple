package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageobject {

	@FindBy(xpath="//span[contains(text(),'My Account')]")
	public static WebElement My_Accounts;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li[2]//a[contains(text(),'Login')]")
	public static WebElement Login;
	@FindBy(xpath="//input[@id='input-email']")
	public static WebElement Email_id;
	@FindBy(xpath="//input[@id='input-password']")
	public static WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement submit_Btn;
}
 