package entrataTests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import entrataPages.HomePage;
/*
 * HeaderTest tests weather the header tabs such as Products, Solutions, Resources, Base Camp Login Button are correctly loaded or not
 * Watch Demo has dedicated tests to test weather form is getting filled up or not, and thats why it has been excluded from this Header test
 * */

public class HeaderTest extends BaseTest {
	HomePage homePage;

	@Test(priority = 0)
	public void isProductsTabPresentTest() throws InterruptedException {
		homePage = new HomePage();
		Thread.sleep(3000);
		assertTrue(homePage.isPorductsTabPresent());
	}

	@Test(priority = 1)
	public void isSolutionsTabPresent() throws InterruptedException {
		Thread.sleep(3000);
		assertTrue(homePage.isSolutionsTabPresent());
	}

	@Test(priority = 2)
	public void isResourcesTabPresent() throws InterruptedException {
		Thread.sleep(3000);
		assertTrue(homePage.isResourcesTabPresent());
	}

	@Test(priority = 3)
	public void isBaseCampTabPresent() throws InterruptedException {
		Thread.sleep(3000);
		assertTrue(homePage.isBaseCampTabPresent());
	}

	@Test(priority = 4)
	public void isSignInButtonPresent() throws InterruptedException {
		Thread.sleep(3000);
		assertTrue(homePage.isSignInButtonPresent());
	}
}
