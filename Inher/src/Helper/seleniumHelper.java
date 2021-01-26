package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class seleniumHelper {
    //Launching the URL
    public void Launch(String url)
    {
        System.out.println("Launching the URL");
    }
    //Entering the text
    public void EnterText(String textToEnter, By element, WebDriver driver)
    {
        try {

            driver.findElement(element).sendKeys(textToEnter);
            System.out.println("Entering the Text");
        }catch (Exception e)
        {

        }
    }
    //Clearing the text
    public void ClearText(String url)
    {
        System.out.println("Entering the Text");
    }
    //isDisplayed
    //Wait
    //checkErrorMessage
    //Accept
    //Dismiss
    //AlertGetText
    //closeBrowser
}
