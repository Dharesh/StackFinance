package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class FileManager {
	Properties pro;

	public FileManager() {
		try {
			FileInputStream fis = new FileInputStream(
					"E:\\Selenium\\StackFinanceAssignment\\src\\test\\resources\\systemlibrary.properties");
			pro = new Properties();
			pro.load(fis);// load the property file
		} catch (Exception e) {
			System.out.println(" property file not found");
		}
	}

	public String getSystemLibraryUrl() {
		String url = pro.getProperty("systemLibraryUrl");
		if (url != null) {
			return url;
		} else {
			throw new RuntimeException("SystemLibrary url not found");
		}
	}

	public String getUserName() {
		String un = pro.getProperty("userName.User");
		return un;
	}

	public String getPasswordUser() {
		String pwda = pro.getProperty("Password.User");
		return pwda;
	}

	public String getpasswordAdmin() {
		String pwd = pro.getProperty("password.Admin");
		return pwd;
	}

	public String getAdminUserName() {
		String key = pro.getProperty("userName.Admin");
		return key;
	}

}
