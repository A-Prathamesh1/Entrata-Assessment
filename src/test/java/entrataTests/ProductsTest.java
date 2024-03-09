package entrataTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import entrataPages.HomePage;
import entrataPages.PropertyMgtPage;

/*
 *Products test makes sure that Products tab is present in the home page also after hovering the products tab it makes sure
 *that the product management page is navigable/reachable  */
public class ProductsTest extends BaseTest {
	HomePage homePage;
	PropertyMgtPage propertyMgtPage;

	@Test(priority = 0)
	public void isProductsTabPresent() throws InterruptedException {
		homePage = new HomePage();
		Thread.sleep(3000); //
		assertTrue(homePage.isPorductsTabPresent());
	}

	@Test(priority = 1, dependsOnMethods = "isProductsTabPresent")
	public void navigateToPropertyManagement() throws InterruptedException {
		Thread.sleep(3000);
		homePage.hoverOverProductsTab();
		propertyMgtPage = homePage.navigateToProductMgtHeading();
		Thread.sleep(3000);
		assertEquals(propertyMgtPage.getPropertyMgtPageTitle(), "Property Management by Entrata");
	}
}
