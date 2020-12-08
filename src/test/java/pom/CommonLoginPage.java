package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class CommonLoginPage extends Base_Page {

	public CommonLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "username")
	private WebElement userNameTxtBx;

	public void inputUserName(String userName) {
		userNameTxtBx.sendKeys(userName);
	}

	@FindBy(name = "password")
	private WebElement passwordTxtBx;

	public void inputPassword(String password) {
		passwordTxtBx.sendKeys(password);
	}

	@FindBy(tagName = "button")
	private WebElement loginBtn;

	public void clickLoginBtn() {
		loginBtn.click();
	}

}
