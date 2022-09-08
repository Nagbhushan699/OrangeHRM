package com.orangeHrm.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordPage {
	WebDriver driver;
	//WebElements
private	By resetPass=By.xpath("//h6[text()='Reset Password']");
private	By userName=By.xpath("//input[@name='username']");
private	By cancel=By.xpath("//button[contains(@class,'cancel')]");
private	By resetBtn=By.xpath("//button[@type='submit']");
	
	public ResetPasswordPage(WebDriver driver) {
		this.driver=driver;
	}
	//page actions
	public String checkResetPassText() {
		return driver.findElement(resetPass).getText();
	}
	public boolean checkUsernameDisplay() {
		return driver.findElement(userName).isDisplayed();
	}
	public boolean checkCancelBtnDisplay() {
		return driver.findElement(cancel).isDisplayed();
	}
	public boolean checkResetPassBtnISdisplay() {
		return driver.findElement(resetBtn).isDisplayed();
	}
	public String enterUsername(String usn) {
		WebElement username=driver.findElement(userName);
		username.sendKeys(usn);
		String usnInput=username.getAttribute("value");
		return usnInput;
	}
	public String checkResetText() {
		driver.findElement(resetBtn).click();
		return driver.findElement(resetPass).getText();
	}
//  public String checkResetPassText() {
//	   return driver.findElement(resetPass).getText();
//}
}
