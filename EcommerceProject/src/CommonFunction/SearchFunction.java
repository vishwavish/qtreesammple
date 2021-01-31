package CommonFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.SearchFunctionObjects;

public class SearchFunction  extends Loginpage {
	String text=null;
	Actions act=null;
	String search_text=null;
	WebDriverWait wait=null;
	@Test
	public void Search()
	{
		PageFactory.initElements(driver, SearchFunctionObjects.class);
		SearchFunctionObjects.search_textbox.sendKeys("MacBook Pro");
		SearchFunctionObjects.Search_Btn.click();
		
	}
	
   public void scrolldown()
    {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	//Search();
    	 act = new Actions(driver);
         act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
         System.out.println("Scroll down perfomed");
         
}
	
	public void Get_Search_Text()
	{
		
		String text=driver.findElement(By.xpath("//h1[contains(text(),'Search - MacBook Pro')]")).getText();
		System.out.println(text);
	
	}
	@Test
	public void Verify_search()
	{
		
        String search_text=driver.findElement(By.xpath("//div[@class='caption']//h4//a")).getText();
        System.out.println(search_text);
        String price=driver.findElement(By.xpath("//p[@class='price']")).getText();
        System.out.println(price);
		if(search_text.contains("MacBook Pro"))
     {
			
			driver.findElement(By.xpath("//div[@class='caption']//h4//a")).click();
	}
		else
		{
			System.out.println("Serach product is not found");
		}
}
}