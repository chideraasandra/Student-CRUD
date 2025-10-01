package pages;

import static org.testng.Assert.assertFalse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import library.Constants;

public class CourseManagement_Page {
	
	WebDriver driver;
	WebDriverWait wait;
	CourseManagement_Page crsmgt;

	public CourseManagement_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators for Course Management page;
	By courseManagementNavbar = By.xpath("//a[contains(text(), 'Course Management')]");
	By createCourseButton = By.xpath("//a[contains(text(), 'Create Course')]");
	By courseNameField = By.xpath("//input[@id='name']");
	By courseCodeField = By.xpath("//input[@id='code']");
	By createSubjButton = By.xpath("//button[@id='create_subj']");
	By courseField = By.xpath("//div[contains (text(), 'Selenium')]");
	By editCourseButton = By.xpath("//a[@id='edit_course']");
	By delCourseButton = By.xpath("//a[@id='delete_course']");
	By updateCrsButton = By.xpath("//button[@id='update_btn']");
	By courseName = By.xpath("//div[contains(text(), 'Mechanical Engineering Technology')]");
	By errorText = By.xpath("//div[@class='exception-summary ']");
	By courseSearch = By.xpath("//div[contains(text(), 'English Language')]");
	
	public void createCourse() {
		driver.findElement(courseManagementNavbar).click();
		driver.findElement(createCourseButton).click();
		driver.findElement(courseNameField).sendKeys(Constants.COURSE_NAME);
		driver.findElement(courseCodeField).sendKeys(Constants.COURSE_CODE);
		driver.findElement(createSubjButton).click();	
	}
	
	public void updateCourse() {
		driver.findElement(courseManagementNavbar).click();
		driver.findElement(courseName).click();
		driver.findElement(editCourseButton).click();
		driver.findElement(courseCodeField).click();
		driver.findElement(courseCodeField).clear();
		driver.findElement(courseCodeField).sendKeys(Constants.COURSE_CODE_1);
		driver.findElement(updateCrsButton).click();	
	}
	
	public void deleteCourse() throws Exception {
		driver.findElement(courseManagementNavbar).click();
		driver.findElement(courseName).click();
		driver.findElement(delCourseButton).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(errorText);
		boolean status = element.isDisplayed();
		assertFalse(status);
	}
	
	public void searchCourse() {
		driver.findElement(courseManagementNavbar).click();
		driver.findElement(courseSearch).click();
	}

}








