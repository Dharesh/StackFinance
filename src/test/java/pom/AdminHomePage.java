package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class AdminHomePage extends Base_Page {

	public AdminHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "manage_page")
	private WebElement managePageTab;

	public void clickManagePageTab() {
		managePageTab.click();
	}

	@FindBy(css = "a[class='btn btn-success'] span")
	private WebElement addNewBookBtn;

	public void clickAddNewBookBtn() {
		addNewBookBtn.click();
	}

	@FindBy(xpath = "//*[@class='card col-md-3 text-center'][4]/div")
	private WebElement bookTitleTxt;

	public WebElement getBookTitleTxt() {
		return bookTitleTxt;
	}

	@FindBy(id = "requests_page")
	private WebElement requestsPageTab;

	public void clickRequestsPageTab() {
		requestsPageTab.click();
	}

	@FindBy(id = "managePageTab")
	private WebElement deleteAllActivitiesTab;

	public void clickDeleteAllActivitiesTab() {
		deleteAllActivitiesTab.click();
	}

	@FindBy(css = "tr:nth-child(1) > td:nth-child(5) > a.edit:nth-child(1) > i")
	private WebElement manageBookEditIcon;

	public void clickManageBookEditIcon() {
		manageBookEditIcon.click();
	}

	@FindBy(xpath = "//*[@class='table table-striped table-hover']/tbody/tr[1]/td[5]")
	private WebElement manageBookDeleteIcon;

	public void clickManageBookDeleteIcon() {
		manageBookDeleteIcon.click();
	}

	@FindBy(css = "input[value='Edit']")
	private WebElement editBtn;

	public void clickEditBtn() {
		editBtn.click();
	}

	@FindBy(id = "issuable")
	private WebElement availableIssueChkBx;

	public void clickAvailableIssueChkBx() {
		availableIssueChkBx.click();
	}

	@FindBy(xpath = "//*[@class='table table-striped table-hover']/tbody/tr[1]")
	private WebElement manageRequestsTableRowTxt;

	public WebElement getManageRequestsTableRowTxt() {
		return manageRequestsTableRowTxt;
	}

	@FindBy(xpath = "//i[contains(text(),'')]")
	private WebElement manageRequestsAproveBtn;

	public void clickManageRequestsAproveBtn() {
		manageRequestsAproveBtn.click();
	}

	@FindBy(css = ".alert.alert-success")
	private WebElement confirmationMsg;

	public WebElement getConfirmationMsg() {
		return confirmationMsg;
	}

	@FindBy(className = "btn btn-lg btn-secondary")
	private WebElement logoutBtn;

	public void clickLogoutBtn() {
		logoutBtn.click();
	}

	@FindBy(className = "btn btn-lg btn-success")
	private WebElement updateBtn;

	public void clickUpdateBtn() {
		updateBtn.click();
	}

	@FindBy(xpath = "//form[@action='/book/addBook']//input[@id='title']")
	private WebElement bookTitleTxtbx;

	public void inputBookTitle(String bookTitle) {
		bookTitleTxtbx.sendKeys(bookTitle);
	}

	@FindBy(xpath = "//form[@action='/book/addBook']//input[@id='author']")
	private WebElement authorTxtBx;

	public void inputAuthor(String author) {
		authorTxtBx.sendKeys(author);
	}

	@FindBy(xpath = "//form[@action='/book/addBook']//textarea[@id='description']")
	private WebElement descriptionTxtBx;

	public void inputDescription(String description) {
		descriptionTxtBx.sendKeys(description);
	}

	@FindBy(xpath = "//form[@action='/book/addBook']//input[@id='stock']")
	private WebElement stockTxtBx;

	public void inputStock(String stock) {
		stockTxtBx.sendKeys(stock);
	}

	@FindBy(css = "input[value='Add']")
	private WebElement addBtn;

	public void clickAddBtn() {
		addBtn.click();
	}
}
