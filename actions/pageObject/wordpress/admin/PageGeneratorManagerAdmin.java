package pageObject.wordpress.admin;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManagerAdmin {

	public static AdminDashboardPageObject getAdminDashboardPage(WebDriver driver) {
		return new AdminDashboardPageObject(driver);
	}

	public static AdminLogInPageObject getAdminLogInPage(WebDriver driver) {
		return new AdminLogInPageObject(driver);
	}

}
