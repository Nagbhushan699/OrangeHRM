package com.orangeHrm.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class My_Info_Page {
	WebDriver driver;
	By firstName=By.xpath("//input[@name='firstName']");
	By middleName=By.xpath("//input[@name='middleName']");
	By lastName=By.xpath("//input[@name='lastName']");
	By nickName=By.xpath("//label[text()='Nickname']/following::input[@class='oxd-input oxd-input--active'][1]");
	By emp_Id=By.xpath("//label[text()='Employee Id']/following::input[@class='oxd-input oxd-input--active'][1]");
	By other_Id=By.xpath("//label[text()='Other Id']/following::input[@class='oxd-input oxd-input--active'][1]");
	By liscense_No=By.xpath("//label[contains(text(),'License Number')]/following::input[@class='oxd-input oxd-input--active'][1]");
	By sip_No=By.xpath("//label[contains(text(),'License Number')]/following::input[@class='oxd-input oxd-input--active'][3]");
	By sin_No=By.xpath("//label[contains(text(),'License Number')]/following::input[@class='oxd-input oxd-input--active'][4]");
	//page Actions
	public My_Info_Page(WebDriver driver) {
		this.driver=driver;
	}
	public String checkFirstName(String fname) throws InterruptedException {
		WebElement first=driver.findElement(firstName);
		 first.sendKeys(Keys.CONTROL+"a");
		 first.sendKeys(Keys.DELETE);
		first.sendKeys(fname);
		String text=first.getAttribute("value");
		return text;
	}
	public String checkMiddleName(String mName) throws InterruptedException {
		WebElement middle=driver.findElement(middleName);
		middle.sendKeys(Keys.CONTROL+"a");
		 middle.sendKeys(Keys.DELETE);
		middle.sendKeys(mName);
		String text=middle.getAttribute("value");
		return text;
	}
	public String checkLastName(String lname) throws InterruptedException {
		WebElement last=driver.findElement(lastName);
		last.sendKeys(Keys.CONTROL+"a");
		 last.sendKeys(Keys.DELETE);
		last.sendKeys(lname);
		String text=last.getAttribute("value");
		return text;
	}
	public String checkNickName(String nickname) {
		WebElement nick=driver.findElement(nickName);
		nick.clear();
		nick.sendKeys(nickname);
		String text=nick.getAttribute("value");
		return text;
	}
	public String checkEmpId(String empid) {
		WebElement id=driver.findElement(emp_Id);
		id.clear();
		id.sendKeys(empid);
		String text=id.getAttribute("value");
		return text;
	}
	public String checkOtherId(String otherid) {
		WebElement id=driver.findElement(other_Id);
		id.clear();
		id.sendKeys(otherid);
		String text=id.getAttribute("value");
		return text;
	}
	public String checkLiscenceNo(String lNo) {
		WebElement id=driver.findElement(liscense_No);
		id.clear();
		id.sendKeys(lNo);
		String text=id.getAttribute("value");
		return text;
	}
	public String checkSipNo(String sNo) {
		WebElement id=driver.findElement(sip_No);
		id.clear();
		id.sendKeys(sNo);
		String text=id.getAttribute("value");
		return text;
	}
	public String checkSinNo(String sNo) {
		WebElement id=driver.findElement(sin_No);
		id.clear();
		id.sendKeys(sNo);
		String text=id.getAttribute("value");
		return text;
	}
}
