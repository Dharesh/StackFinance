package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import generic.FileManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.AdminHomePage;
import pom.CommonLoginPage;
import pom.CommonUIPage;
import pom.LibrarySystemPage;
import pom.UserHomePage;

public class BaseClass {

	WebDriver driver;
	FileManager fm = new FileManager();;
	AdminHomePage adminHomePage;
	CommonUIPage commonUiPage;
	CommonLoginPage commonLoginPage;
	LibrarySystemPage librarySystemPage;
	UserHomePage userHomePage;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(fm.getSystemLibraryUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		fm = new FileManager();
		adminHomePage = new AdminHomePage(driver);
		commonUiPage = new CommonUIPage(driver);
		commonLoginPage = new CommonLoginPage(driver);
		librarySystemPage = new LibrarySystemPage(driver);
		userHomePage = new UserHomePage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
