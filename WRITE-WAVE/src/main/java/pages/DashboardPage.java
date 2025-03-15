package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    // Locators
    private By welcomeMessage = By.xpath("//span[@class='welcome']");
    private By createPostButton = By.xpath("//button[@class='create-btn']");

    // Constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public String getWelcomeMessage() {
        return driver.findElement(welcomeMessage).getText();
    }

    public void clickCreatePost() {
        driver.findElement(createPostButton).click();
    }
}
