package com.orangeHrm.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangeHrm.qa.Constans.Constants;
import com.orangeHrm.utility.DropDown_Utility;

public class Admin_Page {
	WebDriver driver;
	DropDown_Utility dropdown;
	By user_Name=By.xpath("//label[text()='Username']/following::input[contains(@class,'oxd-input oxd-input--active')]");
	By user_Role=By.xpath("//label[text()='User Role']/following::div[@class='oxd-select-text-input'][1]");
	By status=By.xpath("//label[text()='User Role']/following::div[@class='oxd-select-text-input'][2]");
	By emp_Name=By.xpath("//label[text()='Employee Name']/following::input[@placeholder='Type for hints...']");
	By sel_User_Role=By.xpath("//label[text()='User Role']/following::span[text()='ESS']");
//	String sel_User_Role="//label[text()='User Role']/following::span[text()='role']";
//	String sel_status="//label[text()='Status']/following::span[text()='admin']";
	
	By sel_status=By.xpath("//label[text()='Status']/following::span[text()='Enabled']");
	//page Actions
	public Admin_Page(WebDriver driver) {
		this.driver=driver;
	}
	public String checkUsername(String usn) throws InterruptedException {
		driver.navigate().refresh();
		WebElement user=driver.findElement(user_Name);	
		user.clear();
		user.sendKeys(usn);	
		String text=user.getAttribute("value");;
		return text;
	}
	public String checkEmpname(String name) throws InterruptedException {
		WebElement emp=driver.findElement(emp_Name);
        emp.sendKeys(Keys.CONTROL+"a");
        emp.sendKeys(Keys.DELETE);
		emp.sendKeys(name);
		String text=emp.getAttribute("value");
		return text;
	}
	public String checkUser_Role() {
		driver.navigate().refresh();
//		dropdown=new DropDown_Utility();
		driver.findElement(user_Role).click();
		driver.findElement(sel_User_Role).click();
		WebElement role=driver.findElement(sel_User_Role);
		String text=role.getText();
		return text;
	}
	public String checkEmpStaus() {
//		dropdown=new DropDown_Utility();
		driver.findElement(status).click();
		driver.findElement(sel_status).click();
		WebElement st=driver.findElement(status);
		String text=st.getText();
		return text;
	}
}
