package pages;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import library.Constants;

public class StudentManagement_Page {
	
	WebDriver driver;
	StudentManagement_Page stdmgt;
	
	public StudentManagement_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	// Locators for Student Management page;
	By studentManagementNavbar = By.cssSelector("a[href='/students']");
	By createStudentButton = By.xpath("//a[contains(text(), 'Create Student')]");
	By firstNameField = By.xpath("//input[@id='first_name']");
	By lastNameField = By.xpath("//input[@id='last_name']");
	By codeField = By.xpath("//input[@id='reg_no']");
	By createStdButton = By.xpath("//button[@id='create_std']");
	By stdEditButton = By.xpath("//a[@id='edit_std']");
	By stdDeleteButton = By.xpath("//a[@id='delete_std']");
	By delStdCourse = By.xpath("//div[contains(text(), 'Student Courses')]/..//a");
	By studentField = By.xpath("//div[contains (text(), 'Chideraa Onuoha')]");	
	By updateStudentButton = By.xpath("//button[@id='edit_student']");
	By stdCourseDropdown = By.xpath("//select[@id='course_id']");
	By errorText = By.xpath("//body[@class='antialiased']/div/div/div");
	
	
	
	public void createStudent() {
		driver.findElement(studentManagementNavbar).click();
		driver.findElement(createStudentButton).click();
		driver.findElement(firstNameField).sendKeys(Constants.FIRST_NAME);
		driver.findElement(lastNameField).sendKeys(Constants.LAST_NAME);
		driver.findElement(codeField).sendKeys(Constants.CODE);
		driver.findElement(createStdButton).click();
	}
	
	public void updateStudent() throws Exception {
		driver.findElement(studentManagementNavbar).click();
		driver.findElement(studentField).click();
		driver.findElement(stdEditButton).click();
		driver.findElement(codeField).click();
		driver.findElement(codeField).clear();
		driver.findElement(codeField).sendKeys(Constants.CODE_1);
		driver.findElement(updateStudentButton).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(errorText);
		boolean status = element.isDisplayed();
		assertFalse(status);
		
	}
	
	public void deleteStudent() {
		driver.findElement(studentManagementNavbar).click();
		driver.findElement(studentField).click();
		driver.findElement(stdDeleteButton).click();
		
	}

}
