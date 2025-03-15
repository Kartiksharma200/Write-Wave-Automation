package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    By txt_username = By.cssSelector("[placeholder=\"username\"]");
	By txt_password = By.cssSelector("placeholder=\"password\"");
	By btn_login = By.cssSelector("[class=\"login-btn\"]");
//	By btn_login_homePage =  By.cssSelector("[href=\"/login\"]");
	By Verify_Tittle = By.cssSelector("[class=\"h2\"]");
    
    
    
    // Locators
    private By userField = By.xpath("//input[@placeholder='username']");
    private By passwordField = By.xpath("//input[@placeholder='password']");
    private By loginButton = By.xpath("//button[@class='login-btn']");
    private By btn_login_homePage =  By.xpath("//a[normalize-space()='Login']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void clickLoginBtn() {
    	driver.findElement(btn_login_homePage).click();
    }
    
    public void enterEmail(String email) {
        driver.findElement(userField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
