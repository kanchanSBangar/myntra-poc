package com.myntra.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public static WebDriver driver ;
	
	public BasePage() {
		
	}
	
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
	}
	

}
