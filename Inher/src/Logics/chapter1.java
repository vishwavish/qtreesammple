package Logics;

import Helper.seleniumHelper;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chapter1 extends seleniumHelper {
    public static void main(String args[])
    {
        chapter1 testCase=new chapter1();
        WebDriver driver=new ChromeDriver();
        testCase.Launch("");
        testCase.EnterText("Viswa", HomePage.firstName,driver);
    }

    
}
