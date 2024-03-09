package entrataPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResidentPayPage extends BasePage {

	public String getTitleOfResidentPage() {
		String title = driver.getTitle();
		return title;
	}

//	@FindBy(xpath = "//h2[contains(text(),'An award-winning platform for property owners and operators')]")
//	WebElement awardPara;
//
//	public boolean isResidentPayPageAwardParaPresent() {
//		return isElementPresent(awardPara);
//	}

}
