package e2e;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.Constants;
import pages.Home_Page;

public class StudentSearch_e2e {
	
	WebDriver driver;
	Home_Page home;
	
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
	public void Open_Student_Portal() {
		home = new Home_Page(driver);
		home.studentSearch(Constants.CODE);
		
	}

}
