package pages;

import org.openqa.selenium.By;

public class homePage {
    public  By elementsCard = By.xpath("//div[@class='category-cards']//*[text()='Elements']");
    public  By formsCard = By.xpath("//div[@class='category-cards']//*[text()='Forms']");
    public  By WidgetsCard = By.xpath("//div[@class='category-cards']//*[text()='Widgets']");
    public  By windowsCard = By.xpath("//div[@class='category-cards']//*[text()='Alerts, Frame & Windows']//..");
}