package test;

import org.testng.annotations.Test;

public class UserTest extends BaseClass {
	@Test
	public void validateAdminHomePageTitle() {
		librarySystemPage.clickSignInAdmin();
		commonLoginPage.inputUserName(fm.getUserName());
		commonLoginPage.inputPassword(fm.getPasswordUser());
		commonLoginPage.clickLoginBtn();
		commonUiPage.getHomePageTitle().equals("Welcome Dharesh");
	}

	@Test
	public void validateUpdateProfile() {
		librarySystemPage.clickSignInAdmin();
		commonLoginPage.inputUserName(fm.getUserName());
		commonLoginPage.inputPassword(fm.getUserName());
		commonLoginPage.clickLoginBtn();
		userHomePage.inputPhone("9900131747");
		userHomePage.inputGender("Male");
		userHomePage.inputEmail("dhareshkiran@gmail.com");
		userHomePage.inputfirstName("Dharesh");
	}

}
