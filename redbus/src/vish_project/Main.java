package vish_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {
    static Homepage vish;

    public static void main(String[] args) throws IOException {
        System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        Properties dataProp=new Properties();
        FileReader read=new FileReader("dataproperty.properties");
        dataProp.load(read);
        String URL=dataProp.get("URL").toString();
        String textToSelect=dataProp.get("TextToSelect").toString();
        WebDriver driver = new ChromeDriver();
        vish = new Homepage();
        Launch(driver,URL);
        search(driver,textToSelect);

    }

    public static void Launch(WebDriver driver,String URL) {
        driver.get(URL);
        driver.manage().window().maximize();
    }


    public static void search(WebDriver driver,String place) {
        WebElement src = driver.findElement(vish.from);
        src.sendKeys("coimbatore");
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'"+place+"')]")));
        int totalSuggesstions=driver.findElements(By.xpath("//ul[@class='autoFill']//li")).size();
        ArrayList<String> suggestions=new ArrayList<>();
        for(int iterator=1;iterator<=totalSuggesstions;iterator++) {
            System.out.println("(//ul[@class='autoFill']//li)[" + iterator + "])");
            String nae=driver.findElement(By.xpath("(//ul[@class='autoFill']//li)[" + iterator + "]")).getText();
            System.out.println(nae);
            suggestions.add(driver.findElement(By.xpath("(//ul[@class='autoFill']//li)[" + iterator + "]")).getText());
        }
        //driver.findElement(By.xpath("//*[contains(text(),'"+place+"')]")).click();

        String texttoselect = "Ettimadai, Coimbatore";
        List<WebElement> src_places =driver.findElements(Homepage.list);
        int total_counts = src_places.size();
        System.out.println(total_counts);
        for (WebElement suggest : src_places)
        {
            System.out.println(suggest.getText());
            if (suggest.getText().equals(texttoselect))
            {
                System.out.println("Trying to select: " + texttoselect);
                suggest.click();
                break;
            }
            else {
                System.out.println("test case failes");
            }

        }

        System.out.println("Sasi "+" is working in "+" IT "+place);
    }


}


