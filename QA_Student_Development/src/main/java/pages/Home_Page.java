package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {
	
	WebDriver driver;
	WebDriverWait wait;
	Home_Page home;
	
	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators;
	By studentSearchField = By.xpath("//input[@placeholder='Search Student']");
	//By studentId2 = By.xpath("//a[@href='/students/214']");
	By studentId = By.xpath("//a[@class='search-item list-group-item list-group-item-action text-start']");
	
	
	public void studentSearch(String regNo) {
		driver.findElement(studentSearchField).click();
		driver.findElement(studentSearchField).sendKeys(regNo);
		wait = new WebDriverWait(driver, 70);
		wait.until((ExpectedConditions.visibilityOfElementLocated(studentId)));
		driver.findElement(studentId).click();
	}
	
	
	
		
		
		
	
	
	
	
	

}
