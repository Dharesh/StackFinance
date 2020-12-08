package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class LibrarySystemPage extends Base_Page {

	public LibrarySystemPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Sign-In as User")
	private WebElement signInUserBtn;

	public void clickSignInUser() {
		signInUserBtn.click();
	}

	@FindBy(linkText = "Sign-In as Admin")
	private WebElement signInAdminBtn;

	public void clickSignInAdmin() {
		signInAdminBtn.click();
	}

	@FindBy(css = "body > h1")
	private WebElement pageTitle;

	public WebElement getPageTitle() {
		return pageTitle;
	}

}
