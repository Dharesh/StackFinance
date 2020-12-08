package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class UserHomePage extends Base_Page {

	public UserHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Browse Books")
	private WebElement browseBooksTab;

	public void clickBrowseBooksTab() {
		browseBooksTab.click();
	}

	@FindBy(tagName = "button")
	private WebElement loginBtn;

	public void clickLoginBtn() {
		loginBtn.click();
	}

	@FindBy(xpath = "//*[@class='card col-md-3 text-center'][4]/div")
	private WebElement bookTitle;

	public WebElement getBookTitle() {
		return bookTitle;
	}

	@FindBy(linkText = "Activities")
	private WebElement activitiesTab;

	public void clickActivitiesTab() {
		activitiesTab.click();
	}

	@FindBy(linkText = "Delete all activities")
	private WebElement deleteAllActivitiesTab;

	public void clickDeleteAllActivitiesTab() {
		deleteAllActivitiesTab.click();
	}

	@FindBy(xpath = "//*[@class='table overflow-auto']/tbody/tr[1]/td[1]")
	private WebElement activiiesTableRowTxt;

	public WebElement getActiviiesTableRowTxt() {
		return activiiesTableRowTxt;
	}

	@FindBy(className = "btn btn-lg btn-success")
	private WebElement updateBtn;

	public void clickUpdateBtn() {
		updateBtn.click();
	}

	@FindBy(id = "firstName")
	private WebElement firstNameTxtBx;

	public void inputfirstName(String firstName) {
		firstNameTxtBx.sendKeys(firstName);
	}

	@FindBy(id = "email")
	private WebElement emailTxtBx;

	public void inputEmail(String email) {
		emailTxtBx.sendKeys(email);
	}

	@FindBy(id = "gender")
	private WebElement genderTxtBx;

	public void inputGender(String gender) {
		genderTxtBx.sendKeys(gender);
	}

	@FindBy(id = "phone")
	private WebElement phoneTxtBx;

	public void inputPhone(String phone) {
		phoneTxtBx.sendKeys(phone);
	}

}
