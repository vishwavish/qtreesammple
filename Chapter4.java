package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chapter4 {

	static Homepage vish;
	  public static void main(String args[]) throws InterruptedException 
	  {
		  System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 vish=new Homepage();
		 Launch(driver);
		 text(driver);
		 dropdown(driver);
		 alertfun(driver);
		 mousehover(driver);
		 }
	  public static void Launch(WebDriver driver)
	  {
	      driver.get("http://book.theautomatedtester.co.uk/");
	      clickElement(driver,vish.chap4);
	      
	  }
	 public static void text(WebDriver driver)
	 {
		 WebElement inputtext=driver.findElement(vish.text);
		 inputtext.sendKeys("Vishwa");
		 	 
	 }
	 public static void dropdown(WebDriver driver)
	 {
		 WebElement drop=driver.findElement(vish.dd);
		 Select sel=new Select(drop);
		 sel.selectByIndex(3);
		 sel.selectByVisibleText("Selenium RC");
			 	 
	 }
	public static void alertfun(WebDriver driver) throws InterruptedException
		{
			WebElement alertbox=driver.findElement(vish.ale);
			alertbox.sendKeys("Vishwa");
			Thread.sleep(5000);
			Alert alert=driver.switchTo().alert();
			alert.accept();
			//alerts.wait(5000);
			String alrtmsg=driver.switchTo().alert().getText();

			System.out.println(alrtmsg);
		
			}
	 public static void mousehover(WebDriver driver) throws InterruptedException
	 {
		 
		 Actions act=new Actions(driver);
		 WebElement hover=driver.findElement(vish.hov);
		 act.moveToElement(hover).perform();
		 Thread.sleep(5000);
		 Alert alrt=driver.switchTo().alert();
		 
		 Thread.sleep(5000);
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


