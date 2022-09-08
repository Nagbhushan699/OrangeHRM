package com.orangehrm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangeHrm.qa.page.Directory_Page;
import com.orangeHrm.qa.page.HomePage;
import com.orangehrm.qa.basetest.BaseClass;

public class Test_Directory_Page extends BaseClass{
	Directory_Page directory;
	@Test()
	public void testEmpName() {
		System.out.println("parallel=dire");
		HomePage home=	login.loginActions("Admin", "admin123");
		directory=home.check_Directory();
		String actual=	directory.checkEmpName("Nagbhushan");
		String expected="Nagbhushan";
		Assert.assertEquals(actual, expected);
	}
	@Test()
	public void testJobTitle() throws InterruptedException {
		HomePage home=	login.loginActions("Admin", "admin123");
		directory=home.check_Directory();
		String actual=	directory.checkJobTitle();
		String expected="Content Specialist";
		Assert.assertEquals(actual, expected);
	}
	@Test()
	public void testJobLocation() {
		HomePage home=	login.loginActions("Admin", "admin123");
		directory=home.check_Directory();
		String actual=	directory.checkJobLocation();
		String expected="New York Sales Office";
		Assert.assertEquals(actual, expected);
	}
}
