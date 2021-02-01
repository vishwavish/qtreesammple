package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {
	@FindBy(xpath="//ul[@id='main_menu_top']//li[@data-id='menu_account']//a[@class='top menu_account']//i")
	public static  WebElement My_Accounts;
	@FindBy(xpath="//div[@id='topnav']//ul[@class='sub_menu dropdown-menu']//a[@class='sub menu_login']//i")
	public static WebElement login;
 
	@FindBy(xpath="//input[@id='loginFrm_loginname']")
	public static WebElement username;
	@FindBy(xpath="//input[@id='loginFrm_password']")
	public static WebElement password;
	@FindBy(xpath="//button[@title='Login']")
	public static WebElement submit;
	
	

	
	
}
