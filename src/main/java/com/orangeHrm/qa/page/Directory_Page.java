package com.orangeHrm.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Directory_Page {
	WebDriver driver;
	By emp_name=By.xpath("//label[text()='Employee Name']/following::input");
	By job_title=By.xpath("//label[text()='Job Title']/following::div[@class='oxd-select-text-input'][1]");
	By location=By.xpath("//label[text()='Location']/following::div[@class='oxd-select-text-input']");
	By sel_job_title=By.xpath("//span[text()='Content Specialist']");
	By sel_location=By.xpath("//span[text()='New York Sales Office']");
	By search_btn=By.linkText(" Search ");
	By job_Title_Text=By.xpath("//div[text()='Content Specialist']/parent::div[@class='oxd-select-text oxd-select-text--active']");
	//page Actions
	public Directory_Page(WebDriver driver) {
		this.driver=driver;
	}
	public String checkEmpName(String ename) {
		WebElement name=driver.findElement(emp_name);
		name.sendKeys(Keys.CONTROL+"a");
		name.sendKeys(Keys.DELETE);
		name.sendKeys(ename);
		String text=name.getAttribute("value");
		return text;
	}
	public String checkJobTitle() throws InterruptedException {
		driver.findElement(job_title).click();
		driver.findElement(sel_job_title).click();
		return driver.findElement(job_Title_Text).getText();
	}
	public String checkJobLocation() {
		driver.findElement(location).click();
		driver.findElement(sel_location).click();
		return driver.findElement(location).getText();
	}
//	public boolean enterAllDetails(String name) throws InterruptedException {
////		checkEmpName(name);
////		checkJobTitle();
////		checkJobLocation();
////		Thread.sleep(5000);
//		driver.findElement(search_btn).click();;
//		return driver.findElement(search_btn).isDisplayed();
//	}
	
}
