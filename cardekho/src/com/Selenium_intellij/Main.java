package com.Selenium_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int b=1;
        int c = b+calldata();
        System.out.println(c);
        System.out.println("hello");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cardekho.com/");
        driver.manage().window().maximize();

        vish home = new vish();
        WebElement el = driver.findElement(home.Search);
        System.out.println(browserURL(driver));
        el.sendKeys("Maruti Swift");
            //        el.clear();
            //        WebElement al= driver.findElement(home.Search);
            //        al.sendKeys("Maruti Swift");
            //        Thread.sleep(5000);
       // driver.findElement(home.Sea_Btn).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//li[@data-value='Maruti Swift']")).click();
        Thread.sleep(10000);
        String actualURL=browserURL(driver);
        String expectedURL= "https://www.cardekho.com/maruti/swift";
        if(expectedURL.equals(actualURL))
        {
            System.out.println("URL have match");
            Thread.sleep(5000);
            String headerexpectedValue="Maruti Swift";
            String actualheaderValue=driver.findElement(By.xpath("//h1[@class='tooltip']")).getText();
           // comparisionValue(headerexpectedValue,actualheaderValue);
            //comparisionValue("Maruti Swift (BS6)  Price(Exciting Offers!), Images, Review & Specs",driver.getTitle());
            String actualPrice=driver.findElement(By.xpath("//div[@data-track-section='Maruti Swift']//div[@class='price']")).getText();
            String expectedPrice="5.19 - 8.02 Lakh";
            //comparisionValue(expectedPrice,actualPrice);
            String star1=driver.findElement(By.xpath("//div[@data-track-section='Maruti Swift']//div[@class='startRating']//span[@data-index='1']")).getAttribute("class");
            String star2=driver.findElement(By.xpath("//div[@data-track-section='Maruti Swift']//div[@class='startRating']//span[@data-index='2']")).getAttribute("class");
            String star3=driver.findElement(By.xpath("//div[@data-track-section='Maruti Swift']//div[@class='startRating']//span[@data-index='3']")).getAttribute("class");
            String star4=driver.findElement(By.xpath("//div[@data-track-section='Maruti Swift']//div[@class='startRating']//span[@data-index='4']")).getAttribute("class");
            String star5=driver.findElement(By.xpath("//div[@data-track-section='Maruti Swift']//div[@class='startRating']//span[@data-index='5']")).getAttribute("class");



        }else
        {
            throw new AssertionError("URL doesn't match");
        }
        driver.close();


        //
        //driver.findElement(home.selectmodel).click();
        //Thread.sleep(10000);

         /*   WebElement mod=d;
//*[@id="ucModel"]
            Select dropdown=new Select(river.findElement(By.xpath("//*[@id='ucModel']")).click()\);
            dropdown.selectByVisibleText("Audi A8");
        //driver.findElement(home.city).click();
       // WebElement dropdown2=driver.findElement(home.city);
       // Select select1=new Select(dropdown1);
       // select1.selectByValue("4");
       // Thread.sleep(10000);
       // driver.findElement(home.serch).click();
       // Thread.sleep(5000);

          */


    }
public static int calldata()
{
    return 1;
}

public static String browserURL(WebDriver driver)
{
    return driver.getCurrentUrl();
}

public static void comparisionValue(String expectedValue,String actualValue)
{
    if(expectedValue.equals(actualValue))
        System.out.println(expectedValue+" is matched");
    else
        throw new AssertionError(expectedValue+" is not matched");
}


}
