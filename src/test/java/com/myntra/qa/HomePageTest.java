package com.myntra.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {

	HomePage homepage;

	@BeforeTest
	public void setUp() {
		initialize();
		homepage = new HomePage();
	}

	@Test
	public void validate_HomePage_Title() {

		Assert.assertEquals(homepage.getTitle(), "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra",
				"Title is not matching");

	}

	@Test
	public void Verify_contactus_link_display() {
		Assert.assertTrue(homepage.Contact_Us.isDisplayed(), "Contact us link is not displayed");
	}
	
	@Test
	public void Verify_GiftCards_link_display() {
		Assert.assertTrue(homepage.GiftCard.isDisplayed(), "Contact us link is not displayed");
	}
	
	@Test
	public void Verify_TrackOrders_link_display() {
		Assert.assertTrue(homepage.Track_Orders.isDisplayed(), "Contact us link is not displayed");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
