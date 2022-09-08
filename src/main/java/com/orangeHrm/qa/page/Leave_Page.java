package com.orangeHrm.qa.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangeHrm.qa.Constans.Constants;
import com.orangeHrm.utility.Calendar_Utility;
import com.orangeHrm.utility.DropDown_Utility;

public class Leave_Page {
	WebDriver driver;
	Calendar_Utility cal;
	DropDown_Utility dropdown;
	//WebElements

	By fromDate=By.xpath("//label[text()='From Date']/ancestor::div[contains(@class,'oxd-input-group')]//input");
	By toDate=By.xpath("//label[text()='To Date']/ancestor::div[contains(@class,'oxd-input-group')]//input");
	By leaveList=By.xpath("//h5[text()='Leave List']");
	By sel_Leave_Status=By.xpath("//label[text()='Show Leave with Status']/following::div[text()='Select']");
	By click_Mont=By.xpath("//div[contains(@class,'month-selected')]/p");
	By click_Year=By.xpath("//div[contains(@class,'year-selected')]//p");
	String sel_Year="//li[text()='year']";
	String sel_Date= "//div[@class='oxd-calendar-date' and text()='day']";
	String sel_Month="//li[text()='month']";
	//	By leave_status_Drop=By.xpath("//span[text()='Taken']");
	String leave_status_Drop="//span[text()='status']";
	By leave_Staus_Chip=By.xpath("//span[@class='oxd-chip oxd-chip--default oxd-multiselect-chips-selected']");
	By emp_Name=By.xpath("//label[text()='Employee Name']/following::input[@placeholder='Type for hints...']");
	//    By past_Emp=By.className("oxd-switch-input oxd-switch-input--active --label-right");
	public Leave_Page(WebDriver driver) {
		this.driver=driver;
	}
	//page actions
	public String chechkLeaveList() {
		return driver.findElement(leaveList).getText();
	}
	public String checkFromDate() {
		cal=new Calendar_Utility();
		WebElement fromdate=driver.findElement(fromDate);
		fromdate.click();
		driver.findElement(click_Mont).click();
		driver.findElement(By.xpath(cal.calendarSel_Mon(sel_Month, "May"))).click();
		driver.findElement(click_Year).click();
		driver.findElement(By.xpath(cal.calendarSel_Yr(sel_Year, "2021"))).click();	
		driver.findElement(By.xpath(cal.calendarSel_Date(sel_Date, "20"))).click();
		String actual=driver.findElement(fromDate).getAttribute("value");
		return actual;
	}
	public String checkToDate() throws InterruptedException {
		cal=new Calendar_Utility();
		driver.navigate().refresh();
		WebElement todate=driver.findElement(toDate);
		todate.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-300)", " ");
		driver.findElement(click_Mont).click();
		driver.findElement(By.xpath(cal.calendarSel_Mon(sel_Month, "April"))).click();
		driver.findElement(click_Year).click();
		driver.findElement(By.xpath(cal.calendarSel_Yr(sel_Year, "2022"))).click();	
		driver.findElement(By.xpath(cal.calendarSel_Date(sel_Date, "20"))).click();
		String actual=driver.findElement(toDate).getAttribute("value");
		return actual;
	}
	public String checksel_Leave_Status() throws InterruptedException {
		dropdown=new DropDown_Utility();
		driver.findElement(sel_Leave_Status).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,-300)", " ");
		String text=" ";
		driver.findElement(By.xpath(dropdown.getLeaveStatus(leave_status_Drop,Constants.lEAVE_WITH_STATUS[1]))).click();
		List<WebElement>list=	driver.findElements(leave_Staus_Chip);
		for(WebElement ele:list) {
			text=ele.getText();
		}
		return text;
	}
	public String check_EmpName() {
		WebElement emp=driver.findElement(emp_Name);
		emp.sendKeys("Nagbhushan");
		String text=emp.getAttribute("value");
		return text;
	}
	//	public boolean checkPastEmp_Enabled() {
	//		driver.findElement(past_Emp).click();
	//		return driver.findElement(past_Emp).isEnabled() ;
	//		
	//	}

}
