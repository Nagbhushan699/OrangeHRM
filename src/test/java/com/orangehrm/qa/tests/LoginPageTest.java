package com.orangehrm.qa.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrm.qa.Constans.Constants;
import com.orangeHrm.qa.page.HomePage;
import com.orangeHrm.qa.page.LoginPage;
import com.orangeHrm.qa.page.ResetPasswordPage;
import com.orangehrm.qa.basetest.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends BaseClass{
	@Test(priority = 3)
	public void testLogin() throws InterruptedException {
		login =	login.goToLoginPage();
		//this statement is used here to check when we click on login button it is safely landed on homepage 
		HomePage homepage=login.loginActions(prop.getProperty("username"),prop.getProperty("password"));	
		String actual= homepage.checkUsername();
		String expected=Constants.USERNAME_HOMEPAGE;
		Assert.assertEquals(actual, expected);
	}
		@Test
		public void checkUn() {
			String actualUn=login.enterUserName("Admin1");
			String expected=Constants.USER_NAME;
			Assert.assertEquals(actualUn, expected);
		}
	@Test(priority = 2)
	public void checkResetText() {
		ResetPasswordPage reset=login.clickForgotPass();
		String actual=	reset.checkResetText();
		String expected="Reset Password";
		Assert.assertEquals(actual, expected);
	}
	@Test(priority = 1)
	public void checkPass() {

		String actualPass=login.enterPassword("admin123");
		String expectedPass=Constants.PASSWORD;
		Assert.assertEquals(actualPass, expectedPass);

	}
//		@Test(priority = 2)
//		public void checkLoginBtn() {
//			boolean actualLoginBtn=login.clickLogin();
//			boolean expected=true;
//			Assert.assertEquals(actualLoginBtn, expected);
//		}


}
