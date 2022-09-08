package com.orangehrm.qa.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangeHrm.qa.Constans.Constants;
import com.orangeHrm.qa.page.Admin_Page;
import com.orangeHrm.qa.page.HomePage;
import com.orangeHrm.qa.page.Leave_Page;
import com.orangeHrm.qa.page.My_Info_Page;
import com.orangehrm.qa.basetest.BaseClass;

public class TestHomePage extends BaseClass
{
	HomePage homepage;
		@Test
		public void testLeavepage() {
			homepage=login.loginActions("Admin", "admin123");
			homepage.goBackToHomepage();
//			driver.navigate().back();
		Leave_Page leave=homepage.LeaveIsDisplay();
		String actual=leave.chechkLeaveList();
		String expected=Constants.EXPECTED_lEAVE_LISTEXT;
		Assert.assertEquals(actual,expected);
		}
		@Test
		public void test_Admin_Page() throws InterruptedException {
			homepage=login.loginActions("Admin", "admin123");
//			driver.navigate().back();
			homepage.goBackToHomepage();
		Admin_Page admin=	homepage.check_Admin();
		String actual=admin.checkEmpname("Nagbhushan");
		String expected=Constants.ADMIN_NAME;
		}
		@Test
		public void test_My_Info_Page() {
			homepage=login.loginActions("Admin", "admin123");
			homepage.goBackToHomepage();
//			driver.navigate().back();
		My_Info_Page info=	homepage.check_My_Info();
		String actual=info.checkEmpId("bhushan12");
		String expected="bhushan12";
		Assert.assertEquals(actual,expected);
		}
	@Test
	public void checkMenuList() {
		homepage=login.loginActions("Admin", "admin123");
		homepage.goBackToHomepage();	
		List<String>expected=Constants.menuItems;
		List<String> actual=homepage.menuListIsDisplayed();
		Assert.assertEquals(actual.size(), expected.size());
		Assert.assertEquals(actual, expected);	
	}
	@Test
	public void checkEmployeeInfo() {	
		homepage=login.loginActions("Admin", "admin123");
		boolean actual=	homepage.employeeInfo();
		Assert.assertTrue(actual);
	}
	@Test
	public void checkAddBtn() {	
		homepage=login.loginActions("Admin", "admin123");
		boolean addBtn=homepage.addButtonIsDisplay();
		Assert.assertTrue(addBtn);	
	}
}
