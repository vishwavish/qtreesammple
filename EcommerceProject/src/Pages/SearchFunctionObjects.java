package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFunctionObjects {

	@FindBy(xpath="//input[@name='search']")
	public static WebElement search_textbox;
	@FindBy(xpath="//span[@class='input-group-btn']//button")
	public static WebElement Search_Btn;
	

}
