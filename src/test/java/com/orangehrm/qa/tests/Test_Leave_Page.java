package com.orangehrm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangeHrm.qa.Constans.Constants;
import com.orangeHrm.qa.page.HomePage;
import com.orangeHrm.qa.page.Leave_Page;
import com.orangehrm.qa.basetest.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Leave_Page extends BaseClass{
	Leave_Page leavepage;

	@Test
	public void testLeaveListText() {
		HomePage homepage=login.loginActions("Admin","admin123");
		leavepage=homepage.LeaveIsDisplay();
		String actual=leavepage.chechkLeaveList();
		String expected=Constants.EXPECTED_lEAVE_LISTEXT;
		Assert.assertEquals(actual,expected);
	}
	@Test
	public void checkFromDate() {
		HomePage homepage=login.loginActions("Admin","admin123");
		leavepage=homepage.LeaveIsDisplay();
		String actual=	leavepage.checkFromDate();
		String expected=Constants.EXPECTED_FROM_DATE;
		Assert.assertEquals(actual, expected);	
	}
	@Test
	public void checkToDate() throws InterruptedException {
		HomePage homepage=login.loginActions("Admin","admin123");
		leavepage=homepage.LeaveIsDisplay();
		String actual=	leavepage.checkToDate();
		String expected=Constants.EXPECTED_TO_DATE;
		Assert.assertEquals(actual, expected);	
	}
	@Test
	public void checkLeaveStatus() throws InterruptedException {
		String actual=	leavepage.checksel_Leave_Status();
		String expected=Constants.lEAVE_WITH_STATUS[1];
		Assert.assertEquals(actual,expected);
	}
	@Test
	public void test_EmpName() {
		HomePage homepage=login.loginActions("Admin","admin123");
		leavepage=homepage.LeaveIsDisplay();
		String actual=	leavepage.check_EmpName();
		String expected=Constants.EXPECTED_EMP_NAME;
		Assert.assertEquals(actual, expected);
	}
}
