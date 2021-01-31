package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCartObject {

	@FindBy(xpath="//button[contains(text(),'Add to Cart')]")
	public static WebElement addtocart;
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	public static WebElement Shopcart;
	@FindBy(xpath="//div[@class='col-sm-4']//h1[contains(text(),'MacBook Pro')]")
	public static WebElement checkcart;
	@FindBy(xpath="//table[@class='table table-bordered']//tbody//tr[1]//td[2]//a")
	public static WebElement cartinshop;
	
	
	 
	
}
