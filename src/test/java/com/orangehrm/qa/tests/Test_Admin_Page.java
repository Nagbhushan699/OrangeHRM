package com.orangehrm.qa.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.orangeHrm.qa.Constans.Constants;
import com.orangeHrm.qa.page.Admin_Page;
import com.orangeHrm.qa.page.HomePage;
import com.orangeHrm.utility.ExcelReader;
import com.orangehrm.qa.basetest.BaseClass;

import java.io.IOException;

import org.apache.log4j.Logger;
public class Test_Admin_Page extends BaseClass{
	 static  Logger log = Logger.getLogger(Test_Admin_Page.class.getName());
	Admin_Page admin;
	@Test(dataProvider = "data1")
	public void testUsername(String usn) throws InterruptedException {
		HomePage home=	 login.loginActions("Admin", "admin123");
		admin=home.check_Admin();
		System.out.println(usn);
		String actual= admin.checkUsername(usn);
		log.info(" Acutal Result : "+actual);
		String expected=Constants.ADMIN_USER_NAME;
		log.info(" Expected Result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@DataProvider
	public Object[][] data1() throws IOException{
		String userDir=System.getProperty("user.dir");
		String path=userDir+"\\src\\main\\java\\com\\orangeHrm\\utility\\Test_Data.xlsx";
		String sheetName="Credentials";
		ExcelReader excel=new ExcelReader(path,sheetName);
		return excel.getAllData();
	}
	@Test(dataProvider = "data2")
	public void testEmpname(String s1,String s2) throws InterruptedException {
		HomePage home=	 login.loginActions("Admin", "admin123");
		admin=home.check_Admin();
		String actual= admin.checkEmpname(s2);
		log.info(" Actual Result : "+actual);
		String expected=Constants.ADMIN_NAME;
		log.info(" Expected Result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@DataProvider
	public Object[][] data2() throws IOException{
		String userDir=System.getProperty("user.dir");
		String path=userDir+"\\src\\main\\java\\com\\orangeHrm\\utility\\Test_Data.xlsx";
		String sheetName="Credentials";
		ExcelReader excel=new ExcelReader(path,sheetName);
		return excel.getAllData();
	}
	@Test
	public void testUser_Role() {
		HomePage home=	 login.loginActions("Admin", "admin123");
		admin=home.check_Admin();
		String actual= admin.checkUser_Role();
		log.info("Actual result : "+actual);
		String expected=Constants.USER_ROLE[1];
		log.info("Expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testEmpStaus() {
		HomePage home=	 login.loginActions("Admin", "admin123");
		admin=home.check_Admin();
		String actual= admin.checkEmpStaus();
		log.info("Actual result : "+actual);
		String expected=Constants.ADMIN_STATUS[0];
		log.info("Expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
}
