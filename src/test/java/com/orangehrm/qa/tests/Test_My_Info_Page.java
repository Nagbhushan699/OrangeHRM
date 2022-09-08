package com.orangehrm.qa.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHrm.qa.page.HomePage;
import com.orangeHrm.qa.page.My_Info_Page;
import com.orangeHrm.utility.ExcelReader;
import com.orangehrm.qa.basetest.BaseClass;
import org.apache.log4j.Logger;
public class Test_My_Info_Page extends BaseClass {
	static Logger log=Logger.getLogger(Test_My_Info_Page.class.getName());
	WebDriver driver;
	My_Info_Page info;
	@Test(dataProvider = "dp1")
	public void testFirstName(String s1,String s2) throws InterruptedException {
		HomePage home=login.loginActions("Admin","admin123");
		info=	home.check_My_Info();
		String actual=	info.checkFirstName(s2);
		String expected="Nagbhushan";
		Assert.assertEquals(actual, expected);
	}
	@DataProvider
	public Object[][] dp1() throws IOException{
		String path=System.getProperty("user.dir");
		System.out.println(path);
		String fullPath=path+"\\src\\main\\java\\com\\orangeHrm\\utility\\Test_Data.xlsx";
		String sheetName="Credentials";
		ExcelReader excel=new ExcelReader(fullPath,sheetName);
		return excel.getAllData();
	}
	@Test(dataProvider = "dp2")
	public void testMiddleName(String s[]) throws InterruptedException {
		HomePage home=login.loginActions("Admin","admin123");
		info=	home.check_My_Info();
		String actual=	info.checkMiddleName(s[2]);
		String expected="Digamber";
		Assert.assertEquals(actual, expected);
	}
	@DataProvider
	public Object[][] dp2() throws IOException{
		String path=System.getProperty("user.dir");
		System.out.println(path);
		String fullPath=path+"\\src\\main\\java\\com\\orangeHrm\\utility\\Test_Data.xlsx";
		String sheetName="Credentials";
		ExcelReader excel=new ExcelReader(fullPath,sheetName);
		return excel.getAllData();
	}
	@Test(dataProvider = "dp3")
	public void testLastName(String s[]) throws InterruptedException {
		HomePage home=login.loginActions("Admin","admin123");
		info=	home.check_My_Info();
		String actual=	info.checkLastName(s[0]);
		String expected="Bhalerao";
		Assert.assertEquals(actual, expected);
	}
	@DataProvider
	public Object[][] dp3() throws IOException {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		String fullPath=path+"\\src\\main\\java\\com\\orangeHrm\\utility\\Test_Data.xlsx";
		String sheetName="TestCases";
		ExcelReader excel=new ExcelReader(fullPath,sheetName);
		return excel.getAllData();
	}
	@Test
	public void testNickName() throws InterruptedException {
		HomePage home=login.loginActions("Admin","admin123");
		info=	home.check_My_Info();
		String actual=	info.checkLastName("pappya");
		String expected="pappya";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testEmpId() {
		HomePage home=login.loginActions("Admin","admin123");
		info=	home.check_My_Info();
		String actual=	info.checkEmpId("bhushan123");
		String expected="bhushan123";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testOtherId() {
		HomePage home=login.loginActions("Admin","admin123");
		info=	home.check_My_Info();
		String actual=	info.checkOtherId("karan123");
		String expected="karan123";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testLiscenceNo() {
		HomePage home=login.loginActions("Admin","admin123");
		info=	home.check_My_Info();
		String actual=	info.checkLiscenceNo("LB124");
		String expected="LB124";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testSipNo() {
		HomePage home=login.loginActions("Admin","admin123");
		info=	home.check_My_Info();
		String actual=	info.checkSipNo("12");
		String expected="12";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testSinNo() {
		HomePage home=login.loginActions("Admin","admin123");
		info=	home.check_My_Info();
		String actual=	info.checkSinNo("50");
		String expected="50";
		Assert.assertEquals(actual, expected);
	}
}
