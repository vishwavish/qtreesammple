package vish_project;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.thomascook.in/");
        driver.manage().window().maximize();
        String oldwindow= driver.getWindowHandle();

        driver.findElement(By.xpath("//li[@class='flight_menu']/a")).click();

        for (String winhandle: driver.getWindowHandles()) {
            driver.switchTo().window(winhandle);
            System.out.println("Window Switch");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id='thomascook_news']/div/div/div[1]/button")).click();
        }

       WebElement radio2=driver.findElement(By.xpath("//label[@id='oneWay']"));
        boolean radioBtnIsDisplayed = radio2.isDisplayed();

        System.out.println("Is  radio button displayed: "+radioBtnIsDisplayed);
        boolean radioBtnIsEnabled = radio2.isEnabled();

        System.out.println("Is radio button enabled: "+radioBtnIsEnabled);

        boolean radioBtnIsSelected = radio2.isSelected();

        System.out.println("Default Radio button selection Status: "+radioBtnIsSelected);
        radio2.click();
       WebElement from=driver.findElement(By.xpath("//input[@id='input-search-from']"));
        Thread.sleep(3000);
        from.sendKeys("Bangalore");
        Thread.sleep(3000);
        from.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        from.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement to= driver.findElement(By.xpath("//input[@id='input-search-to']"));
        Thread.sleep(3000);
        to.sendKeys("Madurai");
        Thread.sleep(3000);
        to.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        to.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
       WebElement date=driver.findElement(By.xpath("//input[@class='form-control departCal hasDatepicker']"));
        date.click();
       WebElement dateselected=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[2]"));
       dateselected.click();
        WebElement search=driver.findElement(By.xpath("//button[@id='search-button']"));
        search.click();




    }



}
