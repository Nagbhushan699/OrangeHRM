package com.orangehrm.qa.basetest;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangeHrm.qa.page.LoginPage;
import com.orangeHrm.utility.ConfigProperties;
import com.orangeHrm.utility.Screenshot_Utility;
import com.qa.orangehrm.driverfactory.driverFactory;

public class BaseClass {
	protected LoginPage login;
protected	driverFactory df;
protected static Properties prop;
	protected WebDriver driver;
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		prop=ConfigProperties.loadProperties("Uat");
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		df=new driverFactory();
		df.int_driver();
		df.getDriver().get(prop.getProperty("baseUrl"));
		login = new LoginPage(df.getDriver());
		Thread.sleep(5000);
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		System.out.println("In driver method");
		System.out.println(result.getStatus());
		if(result.getStatus()==ITestResult.FAILURE) {
			Screenshot_Utility.takesScreenshot(df.getDriver(), result.getMethod().getMethodName());
		}
		df.getDriver().quit();
	}
}
