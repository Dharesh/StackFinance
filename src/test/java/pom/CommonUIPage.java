package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class CommonUIPage extends Base_Page {

	public CommonUIPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h1[contains(text(),'Welcome')]")
	private WebElement homePageTitle;

	public WebElement getHomePageTitle() {
		return homePageTitle;
	}

	@FindBy(css = ".btn.btn-lg.btn-secondary")
	private WebElement logoutBtn;

	public void clickLogoutBtn() {
		logoutBtn.click();
	}

	@FindBy(className = "alert alert-success")
	private WebElement confirmationMsg;

	public WebElement getConfirmationMsg() {
		return confirmationMsg;
	}

}
