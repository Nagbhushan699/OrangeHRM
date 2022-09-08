package com.orangeHrm.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Performance_Page {
	WebDriver driver;
	By emp_Name=By.xpath("//label[text()='Employee Name']/following::input[@placeholder='Type for hints...']");
	By job_Jitle=By.xpath("//label[text()='Job Title']/following::div[@class='oxd-select-text-input'][1]");
	By sel_Job_Tilte=By.xpath("//span[text()='Chief Financial Officer']");
	By sub_Unit=By.xpath("//label[text()='Job Title']/following::div[@class='oxd-select-text-input'][2]");
	By sel_Sub_Unit=By.xpath("//span[text()='Engineering']");
	By include_Emp=By.xpath("//label[text()='Job Title']/following::div[@class='oxd-select-text-input'][3]");
	By sel_Include=By.xpath("//span[text()='Current and Past Employees']");
	By review_Status=By.xpath("//label[text()='Job Title']/following::div[@class='oxd-select-text-input'][4]");
	By sel_Reiview_Status=By.xpath("//span[text()='In Progress']");
	//page Actions
	public Performance_Page(WebDriver driver) {
		this.driver=driver;
	}
	public String checkEmpName(String usn) {
		WebElement name=	driver.findElement(emp_Name);
		name.sendKeys(usn);
		String text=name.getAttribute("value");
		return text;
	}
	public String checkJobTitle() {
		driver.findElement(job_Jitle).click();
		driver.findElement(sel_Job_Tilte).click();
		return driver.findElement(job_Jitle).getText();
	}
	public String checkSubUnit() {
		driver.findElement(sub_Unit).click();
		driver.findElement(sel_Sub_Unit).click();
		return driver.findElement(sub_Unit).getText();
	}
	public String checkIncludeEmp() {
		driver.findElement(include_Emp).click();
		driver.findElement(sel_Include).click();
		return driver.findElement(include_Emp).getText();
	}
	public String checkReviewStatus() {
		driver.findElement(review_Status).click();
		driver.findElement(sel_Reiview_Status).click();
		return driver.findElement(review_Status).getText();
	}

}
