package entrataTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import entrataPages.BasePage;

/*
 * Base test launches firefox driver before the start of test suite and closes the browser after every suite run
 * */
public class BaseTest {
	public WebDriver driver;

	@BeforeSuite
	public void init() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		BasePage.driver = driver;
		driver.get("https://www.entrata.com/");
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
