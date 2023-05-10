package com.wordpress.admin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.wordpress.admin.AdminDashboardPageObject;
import pageObject.wordpress.admin.AdminLogInPageObject;
import pageObject.wordpress.admin.PageGeneratorManagerAdmin;

public class Level_1_Create_Read_Update_Delete_Search extends BaseTest {
	private WebDriver driver;
	private AdminLogInPageObject adminLogInPage;
	private AdminDashboardPageObject adminDashboardPage;
	String adminUsername = "hannah";
	String adminPassword = "bongthayyeudoiqua";

	@Parameters({ "browser", "urlAdmin" })
	@BeforeClass
	public void beforeClass(String browserName, String urlAdmin) {
		driver = getBrowserDriver(browserName, urlAdmin);
		log.info("Pre-condition - Step 01: Open Admin Login Page to start log in");
		adminLogInPage = PageGeneratorManagerAdmin.getAdminLogInPage(driver);

		log.info("Pre-condition - Step 02:  Enter email admin" + adminUsername);
		log.info("Pre-condition - Step 03:  Enter admin password" + adminPassword);
		log.info("Pre-condition - Step 04:  Click log in button");
		adminDashboardPage = PageGeneratorManagerAdmin.getAdminDashboardPage(driver);

	}

	@Test
	public void Post_01_Create_New_Post() {
		log.info("Post_01 - Step 01: Click to Post section in the left side bar");
		log.info("Post_01 - Step 02: Click Add New button");
		log.info("Post_01 - Step 03: Enter to post title");
		log.info("Post_01 - Step 04: Enter to post body");
		log.info("Post_01 - Step 05: Click to publish button");
		log.info("Post_01 - Step 06: Verify post published successfully ");

	}

	@Test
	public void Post_02_Search_Post() {
		log.info("Post_02 - Step 01: Go to post search page to check published post ");

	}

	@Test
	public void Post_03_View_Post() {

	}

	@Test
	public void Post_04_Edit_Post() {

	}

	@Test
	public void Post_05_Delete_Post() {

	}

	@AfterClass
	public void afterClass() {
	}

}