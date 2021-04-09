package com.SeleniumDev.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumDev.pageObjects.AboutPage;
import com.SeleniumDev.pageObjects.HomePage;

public class TestClass extends BaseClass{

	AboutPage objAbout;
	HomePage objHome;
	String expectedResult ="Selenium is a suite of tools for automating web browsers.";
	
	@Test()
	public void verifyHeaderDescription() throws IOException {
		objHome = new HomePage(driver);
		objAbout = new AboutPage(driver);
		objHome.goAboutPage();
		String actualResult = objAbout.getHeaderDescription();
		if(actualResult.equals(expectedResult)) {
			Assert.assertTrue(true);
		}else {
			captureScreen(driver,"verifyHeaderDescription");
			Assert.fail();
		}
		driver.navigate().back();
	}
}
