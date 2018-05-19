package com.myntra.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(className = "desktop-searchBar")
	WebElement SearchBox;
	
	@FindBy(xpath = "//*[@href='/giftcard' and @class='desktop-preHeaderLinks']")
	WebElement GiftCard;

	@FindBy(xpath = "//*[@href='/my/orders' and @class='desktop-preHeaderLinks']")
	WebElement Track_Orders;

	@FindBy(xpath = "//*[@href='/contactus' and @class='desktop-preHeaderLinks']")
	WebElement Contact_Us;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	

	

}
