package com.SeleniumDev.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver ldriver;
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@onclick='toggleAboutNav()']")
	WebElement aboutNav;
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement aboutSubNav;
	
	
	public void goAboutPage() {
		aboutNav.click();
		aboutSubNav.click();
	}
	
}
