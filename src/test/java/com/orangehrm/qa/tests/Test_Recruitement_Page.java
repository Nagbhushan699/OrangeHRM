package com.orangehrm.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangeHrm.qa.page.HomePage;
import com.orangeHrm.qa.page.Recruitment_Page;
import com.orangehrm.qa.basetest.BaseClass;

public class Test_Recruitement_Page  extends BaseClass{
	Recruitment_Page recruiter;
	WebDriver driver;
	@Test
	public void testVacancy() {
		
		HomePage home=	login.loginActions("Admin","admin123"); 
		recruiter=home.check_Recruitement();
		String actual=recruiter.checkVacancy();
		String expected="Senior QA Lead";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testHiring_Mr() throws InterruptedException {
		HomePage home=	login.loginActions("Admin","admin123"); 
		recruiter=home.check_Recruitement();
		String actual=recruiter.checkHiring_Mr();
		String expected="Dominic Chase";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testStatus() {
		HomePage home=	login.loginActions("Admin","admin123"); 
		recruiter=home.check_Recruitement();
		String actual=recruiter.checkStatus();
		String expected="Interview Passed";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testJob_Title() {
		HomePage home=	login.loginActions("Admin","admin123"); 
		recruiter=home.check_Recruitement();
		String actual=recruiter.checkJob_Title();
		String expected="Chief Executive Officer";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testCandidate_Name() {
		String actual=recruiter.checkCandidate_Name("Nagbhushan");
		String expected="Nagbhushan";
		Assert.assertEquals(actual, expected);
	}
}
