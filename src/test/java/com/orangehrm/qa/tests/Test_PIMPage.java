package com.orangehrm.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangeHrm.qa.page.HomePage;
import com.orangeHrm.qa.page.PIMPage;
import com.orangehrm.qa.basetest.BaseClass;

public class Test_PIMPage extends BaseClass {
	WebDriver driver;
	HomePage page;
	PIMPage pim;
	@BeforeClass
	public void before() {

	}
	@Test
	public void testEmpInfoText() {
		HomePage home=	login.loginActions("Admin", "admin123");
		pim= home.checkPIMPage();
		String actual=	pim.checkEmpInfoText();
		String expected="Employee Information";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testEmp_Id() {
		HomePage home=	login.loginActions("Admin", "admin123");
		pim= home.checkPIMPage();
		String actual=	pim.checkEmp_Id();
		String expected="Bhushan123";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testInclude_Emp() throws InterruptedException {
		HomePage home=	login.loginActions("Admin", "admin123");
		pim= home.checkPIMPage();
		String actual=	pim.checkInclude_Emp();
		String expected="Past Employees Only";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testSupervisorName() {
		HomePage home=	login.loginActions("Admin", "admin123");
		pim= home.checkPIMPage();
		String actual=	pim.checkSupervisorName();
		String expected="Karan";
		Assert.assertEquals(actual, expected);
	}
}
