package logics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.alertsWindowsPage;
import pages.homePage;

public class sampleTestng {
    WebDriver driver;
    demoQA demoObj=new demoQA();
    homePage pageH=new homePage();
    alertsWindowsPage pageW=new alertsWindowsPage();
    @BeforeTest
    public void initateBrowser()
    {

        driver=demoObj.launchChrome();
    }

    @Test
    public void testCase1()
    {
        demoObj.LaunchURL(driver,"https://demoqa.com/");
        demoObj.clickButton(driver,pageH.windowsCard);
    }
    @Test
    public void testCase2()
    {
        demoObj.LaunchURL(driver,"https://demoqa.com/browser-windows");
        demoObj.clickButton(driver,pageW.browserwindows);
    }

    @AfterTest
    public void closeInstance()
    {
        demoObj.closeBrowser(driver);
    }
}
