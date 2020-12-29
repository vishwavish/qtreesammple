package vish_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class hover {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.thomascook.in/");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        WebElement offer = driver.findElement(By.xpath("//*[@id='bs-navbar']/ul/li[8]/a[1]/span"));
        act.moveToElement(offer).build().perform();
        Thread.sleep(3000);
        WebElement holidayoffers=driver.findElement(By.xpath("//a[contains(text(),'Holiday Offers')]"));
        act.moveToElement(holidayoffers).build().perform();
        Thread.sleep(2000);
        holidayoffers.click();
    }


}
