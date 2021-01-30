package logics;

import Helper.seleniumHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.alertsWindowsPage;
import pages.homePage;

import java.io.IOException;
import java.util.Set;

public class demoQA extends seleniumHelper
{
    public static void main(String args[]) throws IOException, InterruptedException {
        demoQA demoObj=new demoQA();
        homePage pageH=new homePage();
        alertsWindowsPage pageW=new alertsWindowsPage();
        WebDriver driver=demoObj.launchChrome();
        demoObj.LaunchURL(driver,"https://demoqa.com/browser-windows");
        demoObj.takeScreenShot(driver,"mywindow");
        Set<String> windowHandle=driver.getWindowHandles();

        int size=driver.getWindowHandles().size();
        System.out.println(size);
        demoObj.clickButton(driver,pageW.newWindow);
        Thread.sleep(5000);
        windowHandle=driver.getWindowHandles();
        size=driver.getWindowHandles().size();
        System.out.println(size);
        driver.switchTo().window(windowHandle.iterator().next());
        driver.switchTo().window(windowHandle.iterator().next());
        demoObj.closeBrowser(driver);
    }

}
