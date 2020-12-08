package test;

import org.testng.annotations.Test;

public class AdminTest extends BaseClass {

	@Test
	public void validateAdminHomePageTitle() {
		librarySystemPage.clickSignInAdmin();
		commonLoginPage.inputUserName(fm.getAdminUserName());
		commonLoginPage.inputPassword(fm.getpasswordAdmin());
		commonLoginPage.clickLoginBtn();
		commonUiPage.getHomePageTitle().equals("Welcome Test");
	}

	@Test
	public void validateAddNewBook() {
		librarySystemPage.clickSignInAdmin();
		commonLoginPage.inputUserName(fm.getAdminUserName());
		commonLoginPage.inputPassword(fm.getpasswordAdmin());
		commonLoginPage.clickLoginBtn();
		adminHomePage.clickManagePageTab();
		adminHomePage.clickAddNewBookBtn();
		adminHomePage.inputBookTitle("Sherlocak");
		adminHomePage.inputAuthor("sherlock Jaaames");
		adminHomePage.inputDescription("Thriiller");
		adminHomePage.inputStock("5");
		adminHomePage.clickAddBtn();
		adminHomePage.getConfirmationMsg().equals("Successfully added a new book");
	}

	@Test
	public void validateEditBookDetails() {
		librarySystemPage.clickSignInAdmin();
		commonLoginPage.inputUserName(fm.getAdminUserName());
		commonLoginPage.inputPassword(fm.getpasswordAdmin());
		commonLoginPage.clickLoginBtn();
		adminHomePage.clickManagePageTab();
		adminHomePage.clickManageBookEditIcon();
		adminHomePage.clickAvailableIssueChkBx();
		adminHomePage.clickEditBtn();
		adminHomePage.getConfirmationMsg().equals("Book updation successful");
	}

	@Test
	public void validateIssueRequest() {
		librarySystemPage.clickSignInAdmin();
		commonLoginPage.inputUserName(fm.getAdminUserName());
		commonLoginPage.inputPassword(fm.getpasswordAdmin());
		commonLoginPage.clickLoginBtn();
		adminHomePage.clickRequestsPageTab();
		adminHomePage.getManageRequestsTableRowTxt().isDisplayed();
	}

	@Test
	public void validateAproveIssueRequest() {
		librarySystemPage.clickSignInAdmin();
		commonLoginPage.inputUserName(fm.getAdminUserName());
		commonLoginPage.inputPassword(fm.getpasswordAdmin());
		commonLoginPage.clickLoginBtn();
		adminHomePage.clickRequestsPageTab();
		adminHomePage.clickManageRequestsAproveBtn();
		// adminHomePage.getConfirmationMsg().equals("Successfully added a new book");
	}

	@Test
	public void validateAdminLoggingOut() {
		librarySystemPage.clickSignInAdmin();
		commonLoginPage.inputUserName(fm.getAdminUserName());
		commonLoginPage.inputPassword(fm.getpasswordAdmin());
		commonLoginPage.clickLoginBtn();
		commonUiPage.getHomePageTitle().equals("Welcome Test");
		commonUiPage.clickLogoutBtn();
		librarySystemPage.getPageTitle().equals("Library System");
	}

}
