package e2e;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import library.Constants;
import pages.CourseManagement_Page;

public class CourseManagement_e2e {
	
	WebDriver driver;
	CourseManagement_Page crsmgt;
		
	
	@BeforeMethod
	public void setup() {
		driver = library.Browsers.launchBrowser("Chrome");
		driver.get(Constants.WEB_URL);
	}
	
	//@AfterMethod
	//public void teardown() {
		//driver.quit();
	//}
	
	@Ignore
	public void Create_Course() {
		crsmgt = new CourseManagement_Page(driver);
		crsmgt.createCourse();
	}
	
	@Ignore
	public void Update_Course() {
		crsmgt = new CourseManagement_Page(driver);
		crsmgt.updateCourse();
	}
	
	@Ignore
	public void Delete_Course() throws Exception{
		crsmgt = new CourseManagement_Page(driver);
		crsmgt.deleteCourse();
	}
	
	@Test
	public void Search_Course() {
		crsmgt = new CourseManagement_Page(driver);
		crsmgt.searchCourse();
	}

}
