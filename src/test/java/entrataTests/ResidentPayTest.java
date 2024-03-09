package entrataTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import entrataPages.HomePage;
import entrataPages.ResidentPayPage;

/*
 * Resident pay test makes sure the products tab is present and Resident pay pages is navigable/reachable 
 * */
public class ResidentPayTest extends BaseTest {
	HomePage homePage;
	ResidentPayPage residentPayPage;

	@Test(priority = 0)
	public void isPorductsTabPresent() throws InterruptedException {
		homePage = new HomePage();
		Thread.sleep(3000);
		assertTrue(homePage.isPorductsTabPresent(), "Products tab is not present");
	}

	@Test(priority = 1, dependsOnMethods = "isPorductsTabPresent")
	public void navigateToResidentPayPage() throws InterruptedException {
		homePage.hoverOverProductsTab();
		residentPayPage = homePage.navigateToResidentPayPage();
		Thread.sleep(4000);
//		assertTrue(residentPayPage.isResidentPayPageAwardParaPresent(), "Resident pay para is not present");
		// Property Management by Entrata
		// ResidentPay complete payment solution paying rent online with any payment
		// method.
		assertEquals(residentPayPage.getTitleOfResidentPage(), "Property Management by Entrata");
	}
}
