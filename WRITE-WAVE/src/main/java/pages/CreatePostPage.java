package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


	public class CreatePostPage {
	    private WebDriver driver;

//	    
//		By create_tittles = By.xpath("//input[@placeholder='Title']");
//		By create_summary = By.xpath("//input[@placeholder='Summary']");
//		By upload_file = By.xpath("//input[@type='file']");
//		By create_post_btn = By.xpath("//button[normalize-space()='Create Post']");
	    
	    
	    // Locators
	    private By titleField = By.xpath("//input[@placeholder='Title']");
	    private By contentField = By.xpath("//input[@placeholder='Summary']");
	    private By upload_file =  By.xpath("//input[@type='file']");
	    private By publishButton = By.xpath("//button[normalize-space()='Create Post']");
	    private By successMessage = By.id("successMessage");

	    // Constructor
	    public CreatePostPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Methods to interact with elements
	    public void enterTitle(String title) {
	        driver.findElement(titleField).sendKeys(title);
	    }

	    public void enterContent(String content) {
	        driver.findElement(contentField).sendKeys(content);
	    }
	    
	    public void uploadfile(String upload) {
	    	driver.findElement(upload_file).sendKeys(upload);
	    }

	    public void clickPublish() {
	        driver.findElement(publishButton).click();
	    }

	    public String getSuccessMessage() {
	        return driver.findElement(successMessage).getText();
	    }
	}

	
	


