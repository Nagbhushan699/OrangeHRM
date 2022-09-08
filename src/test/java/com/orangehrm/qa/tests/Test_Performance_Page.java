package com.orangehrm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangeHrm.qa.page.HomePage;
import com.orangeHrm.qa.page.Performance_Page;
import com.orangehrm.qa.basetest.BaseClass;

public class Test_Performance_Page extends BaseClass {
	Performance_Page perform;
	@Test
	public void testEmpName() {
		HomePage home=	login.loginActions("Admin", "admin123");
		perform=home.check_Performance();	
		String actual=perform.checkEmpName("Nagbhushan");
		String expected="Nagbhushan";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testJobTitle() {
		HomePage home=	login.loginActions("Admin", "admin123");
		perform=home.check_Performance();	
		String actual=perform.checkJobTitle();
		String expected="Chief Financial Officer";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testSubUnit() {
		HomePage home=	login.loginActions("Admin", "admin123");
		perform=home.check_Performance();	
		String actual=perform.checkSubUnit();
		String expected="Engineering";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testIncludeEmp() {
		HomePage home=	login.loginActions("Admin", "admin123");
		perform=home.check_Performance();	
		String actual=perform.checkIncludeEmp();
		String expected="Current and Past Employees";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testReviewStatus() {
		HomePage home=	login.loginActions("Admin", "admin123");
		perform=home.check_Performance();	
		String actual=perform.checkReviewStatus();
		String expected="In Progress";
		Assert.assertEquals(actual, expected);
	}
}
