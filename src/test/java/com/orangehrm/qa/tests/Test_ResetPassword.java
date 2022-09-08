package com.orangehrm.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrm.qa.page.ResetPasswordPage;
import com.orangehrm.qa.basetest.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_ResetPassword extends BaseClass{
	WebDriver driver;
	ResetPasswordPage reset;
	@BeforeClass
	public void before()  {
	reset=login.clickForgotPass();
		
	}
	
	
	@Test
	public void testResetPass() {
		
		String actual=reset.checkResetPassText();
		String expected="Reset Password";
		Assert.assertEquals(actual, expected);	
	}
	@Test
	public void testResetPassText() {
		
		String actual=reset.checkResetPassText();
		String expected="Reset Password";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testUsernameText() {
	
		boolean actual=reset.checkUsernameDisplay();
		Assert.assertTrue(actual);
	}
	@Test
	public void testCancelBtnDisplay() {
		
		boolean actual=	reset.checkCancelBtnDisplay();
		Assert.assertTrue(actual);
	}
	@Test
	public void testResetPassBtnISdisplay() {
		
		boolean actual=	reset.checkResetPassBtnISdisplay();
		Assert.assertTrue(actual);
	}
	@Test
	public void testEnterUsername() {
		
		String actual=reset.enterUsername("nagbhushan");
		String expected="nagbhushan";
		Assert.assertEquals(actual, expected);
	}
	
}
