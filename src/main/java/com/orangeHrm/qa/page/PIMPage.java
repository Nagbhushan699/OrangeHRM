package com.orangeHrm.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PIMPage {
	WebDriver driver;
	//WebElements
	By emp_Info=By.xpath("//h5[text()='Employee Information']");
	By emp_Id=By.xpath("//label[text()='Employee Id']/parent::div/following::input[@class='oxd-input oxd-input--active']");
	By include=By.xpath("//div[text()='Current Employees Only']");
	By supervisor_Name=By.xpath("//label[text()='Supervisor Name']/following::input[@placeholder='Type for hints...']");
	By past_Emp=By.xpath("//span[text()='Past Employees Only']");
	By include_Text=By.xpath("//label[text()='Include']/following::div[@class='oxd-select-text oxd-select-text--active'][1]");
	public PIMPage(WebDriver driver) {
		this.driver=driver;
	}
	//page Actions
	public String checkEmpInfoText() {
		return driver.findElement(emp_Info).getText();
	}
	public String checkEmp_Id() {
		WebElement emp_id=	driver.findElement(emp_Id);
		emp_id.sendKeys("Bhushan123");
		String text=emp_id.getAttribute("value");
		return text;
	}
	public String checkInclude_Emp() throws InterruptedException {
		driver.findElement(include).click();		
		driver.findElement(past_Emp).click();
		return driver.findElement(include_Text).getText();
	}
	public String checkSupervisorName() {
		WebElement ele=driver.findElement(supervisor_Name);
		ele.sendKeys("Karan");
		String text=ele.getAttribute("value");
		return text;
	}
}
