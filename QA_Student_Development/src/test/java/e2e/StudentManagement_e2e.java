package e2e;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.Constants;
import pages.StudentManagement_Page;

public class StudentManagement_e2e {
	
	WebDriver driver;
	StudentManagement_Page stdmgt;;
	
	@BeforeMethod
	public void setup() {
		driver = library.Browsers.launchBrowser("Chrome");
		driver.get(Constants.WEB_URL);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void Create_Student() {
		stdmgt = new StudentManagement_Page(driver);
		stdmgt.createStudent();
	}
	
	@Test
	public void Update_Student() throws Exception{
		stdmgt = new StudentManagement_Page(driver);
		stdmgt.updateStudent();
	}
	
	@Test
	public void Delete_Student() {
		stdmgt = new StudentManagement_Page(driver);
		stdmgt.deleteStudent();
	}

}
