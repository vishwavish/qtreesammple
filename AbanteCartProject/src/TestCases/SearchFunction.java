package TestCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.SearchObject;

public class SearchFunction extends Login_page{
	WebDriverWait wait=null;
    String Actulvalue ="";
	String Expectedvalue="";
	

	public void search()
	{
		PageFactory.initElements(driver, SearchObject.class);
		Actions action=new Actions(driver);
		action.moveToElement(SearchObject.Menu).build().perform();
		action.moveToElement(SearchObject.Shirts_menu).click().build().perform();
	}

	public void clickSearchproduct()
	{
		
		PageFactory.initElements(driver, SearchObject.class);
		SearchObject.view_product.click();
		Select size=new Select(SearchObject.select_size);
		size.selectByIndex(1);
		SearchObject.addcart.click();
		
		}
	
	public void addonemoreproduct() 
	{
		
		PageFactory.initElements(driver, SearchObject.class);
		SearchObject.search_pdt.sendKeys("perfume");
		SearchObject.search_button.click();	
		
		
		SearchObject.clickpdt.click();
		String Actulvalue = SearchObject.verifyselectedpdt.getText();
		System.out.println(Actulvalue);
		SearchObject.addcart2.click();
		SearchObject.home.click();
		SearchObject.carttab.click();
		
		}
	
	public void removeoneproduct()
	{
		
		PageFactory.initElements(driver, SearchObject.class);
		SearchObject.remove.click();

		String Expectedvalue="Obsession Night Perfume";
		 
		
	  
	}

	public void verifycart() 
	{
		
	 if(Actulvalue.equals(Expectedvalue))
	 {
		 SearchObject.checkout.click();
	 }
	 else
	 {
	        throw new AssertionError(Actulvalue+" is not matching with"+ Expectedvalue);
		

	}
	}
	@Test
	 public void checkout()
	 {
		    search();
			clickSearchproduct();
			addonemoreproduct();
			removeoneproduct();
			verifycart();
			PageFactory.initElements(driver, SearchObject.class);
			SearchObject.LocalDelivery.click();
			SearchObject.confirmorder.click();
			
		 
	 }

}
