package CommonFunction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Pages.AddCartObject;

public class AddToCart extends SearchFunction  {
	
    @AfterTest
	public void AddCart() 
	    {
		
		PageFactory.initElements(driver, AddCartObject.class);
		AddCartObject.addtocart.click();
		AddCartObject.Shopcart.click();
		System.out.println("vishwa");
		
	    }
	
	@Test
	public void verifyCart()
	{
		 String cart_text=AddCartObject.checkcart.getText();
		 System.out.print(cart_text);
	
		 String shop_carttext=AddCartObject.Shopcart.getText();
	     if(cart_text.equalsIgnoreCase(shop_carttext))
	     {
	    	 System.out.println("product is matched");
	    	 
	     }
	     else
	     {
	  System.out.println("product not matched");
	     }
	
		
	}
	

}
