package entrataPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/div/div/div[3]/a[1]")
	WebElement watchDemoButton;

	public boolean isWatchDemoButtonPresent() {
		System.out.println("watch demo button ===>" + watchDemoButton.isDisplayed());

		return isElementPresent(watchDemoButton);
	}

	public WatchDemoPage navigateToWatchDemoPage() {
		watchDemoButton.click();
		return new WatchDemoPage();
	}

	@FindBy(xpath = "//div[contains(text(),'Products')]")
	WebElement productsTab;

	public boolean isPorductsTabPresent() {
		return isElementPresent(productsTab);
	}

	public void hoverOverProductsTab() {
		Actions actions = new Actions(driver);
		actions.moveToElement(productsTab).perform();
	}

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[2]/div[1]")
	WebElement solutionsTab;

	public boolean isSolutionsTabPresent() {
		return isElementPresent(solutionsTab);
	}

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a[1]")
	WebElement productMgtHeadingLink;

	public PropertyMgtPage navigateToProductMgtHeading() {
		productMgtHeadingLink.click();
		return new PropertyMgtPage();
	}

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[3]/div[1]")
	WebElement resourcesTab;

	public boolean isResourcesTabPresent() {
		return isElementPresent(resourcesTab);
	}

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[4]/a")
	WebElement baseCampTab;

	public boolean isBaseCampTabPresent() {
		return isElementPresent(baseCampTab);
	}

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[2]")
	WebElement signInButton;

	public boolean isSignInButtonPresent() {
		return isElementPresent(signInButton);
	}

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a[2]")
	WebElement residentPayLink;

	public ResidentPayPage navigateToResidentPayPage() {
		if (isElementPresent(residentPayLink)) {
			residentPayLink.click();
		}
		return new ResidentPayPage();
	}
}
