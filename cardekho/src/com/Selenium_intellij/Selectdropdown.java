package com.Selenium_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectdropdown {
    public static void main(String[] args)throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cardekho.com/");
        driver.manage().window().maximize();
vish mode= new vish();
        driver.findElement(mode.usedcar).click();

        WebElement radio1=driver.findElement(By.xpath("//*[@id=\"HometopBanner\"]/div[2]/div/div[2]/div[2]/div[1]/div[2]/label/i"));
        boolean radioBtnIsDisplayed = radio1.isDisplayed();

        System.out.println("Is  radio button displayed: "+radioBtnIsDisplayed);
        boolean radioBtnIsEnabled = radio1.isEnabled();

        System.out.println("Is radio button enabled: "+radioBtnIsEnabled);

        boolean radioBtnIsSelected = radio1.isSelected();

        System.out.println("Default Radio button selection Status: "+radioBtnIsSelected);
        radio1.click();

        driver.findElement(By.cssSelector("input[id='ucModel']")).click();
        driver.findElement(By.xpath("//*[@id='used_model']/div/ul/li[1]/div/div/div/ul/li[3]")).click();

        driver.findElement(By.cssSelector("input[id='ucMCity']")).click();
        driver.findElement(By.xpath("//*[@id='used_model']/div/ul/li[2]/div/div/div/div[1]/div/div/ul/li[4]")).click();
        Thread.sleep(5000);
        driver.findElement(mode.serch).click();
        Thread.sleep(5000);
driver.quit();
    }
}
