package pageObject.wordpress.user;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManagerUser {

	public static UserHomePageObject getUserHomePage(WebDriver driver) {
		return new UserHomePageObject(driver);
	}

	public static UserPostSearchPageObject getUserPostSearchPage(WebDriver driver) {
		return new UserPostSearchPageObject(driver);
	}

}
