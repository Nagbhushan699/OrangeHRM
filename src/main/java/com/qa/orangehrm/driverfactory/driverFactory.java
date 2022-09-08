package com.qa.orangehrm.driverfactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHrm.utility.ExcelReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactory {
	public static ThreadLocal<WebDriver>tdriver=new ThreadLocal<WebDriver>();
WebDriver driver;
public WebDriver int_driver() {
	WebDriverManager.chromedriver().setup();
	tdriver.set(new ChromeDriver());;
	tdriver.get().manage().window().maximize();
	tdriver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	return tdriver.get();
}
public WebDriver getDriver() {
	return tdriver.get();
}

}
