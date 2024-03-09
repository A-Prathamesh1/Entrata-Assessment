package entrataPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WatchDemoPage extends BasePage {
	@FindBy(xpath = "//*[@id='FirstName']")
	WebElement firstNameInputFiled;

	public void enterFirstName() {
		firstNameInputFiled.sendKeys("Prathamesh");
	}

	@FindBy(xpath = "//*[@id='LastName']")
	WebElement lastNameInputField;

	public void enterLastName() {
		lastNameInputField.sendKeys("Ausekar");
	}

	@FindBy(xpath = "//*[@id='Email']")
	WebElement emailInputField;

	public void enterEmail() {
		emailInputField.sendKeys("prathamesh.ausekar1@gmail.com");
	}

	@FindBy(xpath = "//*[@id='Company']")
	WebElement companyInputField;

	public void enterCompanyName() {
		companyInputField.sendKeys("Entrata");
	}

//	@FindBy(id = "Company")
//	WebElement comapanyInputField;

	@FindBy(id = "Phone")
	WebElement phoneNumberInputField;

	public void enterPhoneNumber() {
		phoneNumberInputField.sendKeys("9518347599");
	}

	@FindBy(id = "Unit_Count__c")
	WebElement unitCountDropDown;

	public void selectUnitCountDropDown() {
		Select select = new Select(unitCountDropDown);
		select.selectByValue("101 - 200");
	}

	@FindBy(id = "Title")
	WebElement jobTitleInputField;

	public void enterJobTitle() {
		jobTitleInputField.sendKeys("SDET");
	}

	@FindBy(id = "demoRequest")
	WebElement demoRequestDropDown;

	public void selectDemoRequestDropDown() {
		Select select = new Select(demoRequestDropDown);
		select.selectByValue("a Resident");
	}

	@FindBy(xpath = "//h1[contains(text(),'Optimize Property Management with One Platform')]")
	WebElement headingWatchDemoPage;

	public boolean isWatchDemoPageHeadingPresent() {
		return isElementPresent(headingWatchDemoPage);
	}

}
