package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chapter1 {
	
	static Homepage vish;
	public static void main(String args[])
	{
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		vish=new Homepage();
	    Launch(driver);
		radio(driver);
		select(driver);
		windowhandling(driver);
		clickcheck(driver);
	
			
	}
	 public static void Launch(WebDriver driver)
	    {
	        driver.get("http://book.theautomatedtester.co.uk/");
	        clickElement(driver,vish.chap1);
	    }
	
	 public static void radio(WebDriver driver)
	 {
		 WebElement rad=driver.findElement(vish.radio);
	        boolean radiobtnIsSelected = rad.isSelected();
	        System.out.println("Is radio buttonselected: "+radiobtnIsSelected);
		 clickElement(driver,vish.radio);
	 }

	 public static void select(WebDriver driver)
	 {
		waitForElementPresence(driver,By.xpath("//*[@id='selecttype']"));
				Select  dd= new Select(driver.findElement(By.xpath("//*[@id='selecttype']")));
				dd.selectByIndex(2);
		 
       }
	 public static void clickcheck(WebDriver driver)
		{
			//WebElement click=driver.findElement(vish.check);
			//boolean clickIsSelected = click.isSelected();
	        //System.out.println("Is radio buttonselected: "+clickIsSelected);
		// waitForElementPresence(driver,By.xpath("//input[@type='checkbox']"));
	     //   clickElement(driver,By.xpath("//input[@type='checkbox']"));
			clickElement(driver,vish.check);
		}
	 
	  public static void windowhandling(WebDriver driver)
	 {
		 String oldwindow= driver.getWindowHandle();
		 WebElement winclick=driver.findElement(vish.window);
		 clickElement(driver,vish.window);
		 
		Set<String> handles=driver.getWindowHandles();
		for(String newwindow:handles)
		{
			driver.switchTo().window(newwindow);
			//String text=driver.findElement(By.xpath("//*[@id='popuptext']")).getText();
			//System.out.println(text);
			driver.close();
		}
		
		 }
	
	
	 public static void waitForElementPresence(WebDriver driver, By element)
	    {
	        
	        WebDriverWait wait=new WebDriverWait(driver,20);
	        wait.until(ExpectedConditions.presenceOfElementLocated(element));
	    }
	public static void clickElement(WebDriver driver, By element)
	    {
	       
	        WebDriverWait wait=new WebDriverWait(driver,50);
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	       
	         driver.findElement(element).click();
	         
	         
	        
	    }


	

}

