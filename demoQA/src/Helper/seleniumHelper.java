package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class seleniumHelper {
    public void LaunchURL(WebDriver driver, String URL)
    {
        driver.get(URL);
        System.out.println("Launching URL");
    }
    public void enterText(WebDriver driver, By element, String textToEnter)
    {
        waitForClick(driver,element);
        driver.findElement(element).sendKeys(textToEnter);
    }

    public void takeScreenShot(WebDriver driver,String fileName) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
        FileHandler.copy(screenshot,new File(fileName+" fileName.png"));

    }

    public void clickButton(WebDriver driver,By element)
    {
        waitForClick(driver,element);
        driver.findElement(element).click();
    }

    public void waitForClick(WebDriver driver,By element)
    {
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }


    public void clearText(WebDriver driver,By element)
    {
        driver.findElement(element).clear();
    }

    public boolean verifyText(String actualText,String ExpectedText)
    {
        if(actualText.equalsIgnoreCase(ExpectedText))
        {
            return true;
        }else
        {
            throw new AssertionError(actualText+" not matching "+ ExpectedText);
        }
    }

    public WebDriver launchChrome()
    {
        System.setProperty("webdriver.chromedriver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        return driver;
    }

    public void closeBrowser(WebDriver driver)
    {
        driver.close();
    }
}
