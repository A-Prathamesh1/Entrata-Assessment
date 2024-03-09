package entrataTests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import entrataPages.HomePage;
import entrataPages.WatchDemoPage;

/*
 * Watch demo page test makes sure the registration page to get the demo link is reachable and form works properly 
 * Note: The form is tested for filling details but not for submission as instructed   
 * 
 * */
public class WatchDemoPageTest extends BaseTest {

	WatchDemoPage watchDemoPage;
	HomePage homePage;

	@Test
	public void launchTest() throws InterruptedException {
		homePage = new HomePage();
		Thread.sleep(3000);
		assertTrue(homePage.isWatchDemoButtonPresent());
	}

	@Test(dependsOnMethods = "launchTest")
	public void navigateToWatchDemoPage() throws InterruptedException {
		watchDemoPage = homePage.navigateToWatchDemoPage();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods = "navigateToWatchDemoPage")
	public void fillWatchDemoForm() {
		watchDemoPage.enterFirstName();
		watchDemoPage.enterLastName();
		watchDemoPage.enterEmail();
		watchDemoPage.enterCompanyName();
		watchDemoPage.enterPhoneNumber();
		watchDemoPage.selectUnitCountDropDown();
		watchDemoPage.enterJobTitle();
		watchDemoPage.selectDemoRequestDropDown();
		assertTrue(watchDemoPage.isWatchDemoPageHeadingPresent());
	}
}
