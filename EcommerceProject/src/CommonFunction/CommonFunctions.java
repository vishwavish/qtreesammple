package CommonFunction;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static WebDriver driver=null;
	public static Properties properties=null;
	
	public Properties loadpropertyfile() throws IOException
	{
		FileInputStream fileinputstream =new FileInputStream("data.properties");
		 properties =new Properties();
		properties.load(fileinputstream);
		return properties;
	}
	@BeforeSuite
	public void LaunchBrowser() throws IOException
	{
		//setup chromedriver 
		
		loadpropertyfile();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		System.setProperty( "webdriver.chrome.driver",
                "webdriver/chromedriver");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			 // Create a new instance of the Chrome driver
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver"," ");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
	}
	@AfterSuite
	public void tearDown()
	{
		//driver.quit();
	}

}

