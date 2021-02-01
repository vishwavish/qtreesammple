package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchObject
{
	@FindBy(xpath="//*[@id='categorymenu']/nav/ul/li[2]/a")
	public static WebElement Menu;
	@FindBy(xpath="//*[@id='categorymenu']/nav/ul/li[2]/div/ul[1]/li[2]/a")
	public static WebElement Shirts_menu;
	@FindBy(xpath="//*[@id='maincontainer']/div/div/div/div/div[3]/div[6]/div[1]/div/a")
	public static WebElement view_product;
	@FindBy(xpath="//select[@id='option352']")
	public static WebElement select_size;
	@FindBy(xpath="//*[@id='product']/fieldset/div[5]/ul/li/a")
	public static WebElement addcart;
	@FindBy(xpath="//input[@id='filter_keyword']")
	public static WebElement search_pdt;
	@FindBy(xpath="//*[@id='search_form']/div/div/i")
	public static WebElement search_button;
	@FindBy(xpath="//*[@id=\"maincontainer\"]/div/div/div/div/div[3]/div[2]/div[2]/a/img")
	public static WebElement clickpdt;
	@FindBy(xpath="//*[@id='product']/fieldset/div[5]/ul/li/a")
	public static WebElement addcart2;
	@FindBy(xpath="//*[@id='categorymenu']/nav/ul/li[1]/a")
	public static WebElement home;
	@FindBy(xpath="//*[@id='main_menu_top']/li[3]/a/span")
	public static WebElement carttab;
	@FindBy(xpath="//*[@id='cart']/div/div[1]/table/tbody/tr[2]/td[7]/a")
	public static WebElement remove;
	@FindBy(xpath="//span[contains(text(),'Obsession Night Perfume')]")
	public static WebElement verifyselectedpdt;
	@FindBy(xpath="//tbody/tr[3]/td[2]/a[1]")
	public static WebElement verifycartpd;
	@FindBy(xpath="	//*[@id='cart_checkout1']")
	public static WebElement checkout;
	@FindBy(xpath="//*[@id='new']/fieldset/form/div[2]/div[2]/div/table/tbody/tr[4]/td[1]/label/div")
	public static WebElement LocalDelivery;
	@FindBy(xpath="//button[@id=\"checkout_btn\"]")
	public static WebElement confirmorder;

	


	
	
	
	
	
	
	


}
