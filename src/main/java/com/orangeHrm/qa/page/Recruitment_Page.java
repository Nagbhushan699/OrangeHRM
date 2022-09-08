package com.orangeHrm.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Recruitment_Page {
	WebDriver driver;
	By job_Title=By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']/descendant::label[text()='Job Title']/following::div[contains(@class,'oxd-select-text-input')][1]");
	By vacancy=By.xpath("//label[text()='Job Title']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/following::div[@class='oxd-select-text-input'][1]");
	By hiring_Mr=By.xpath("//label[text()='Job Title']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/following::div[@class='oxd-select-text-input'][2]");
	By status=By.xpath("//label[text()='Job Title']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/following::div[@class='oxd-select-text-input'][3]");
	By sel_JobTitle=By.xpath("//span[text()='Chief Executive Officer']");
	By jobTitle_Text=By.xpath("//label[text()='Job Title']/following::div[@class='oxd-select-text oxd-select-text--active'][1]");
	By sel_Vacancy=By.xpath("//span[text()='Senior QA Lead']");
	By vacancy_Text=By.xpath("//label[text()='Vacancy']/following::div[@class='oxd-select-text oxd-select-text--active'][1]");
	By sel_Hiring_Mr=By.xpath("//span[text()='']");
	By hiring_Text=By.xpath("//label[text()='Hiring Manager']/following::div[@class='oxd-select-text oxd-select-text--active'][1]");
	By status_App=By.xpath("//span[text()='Interview Passed']");
	By status_Text=By.xpath("//label[text()='Status']/following::div[@class='oxd-select-text oxd-select-text--active'][1]");
	By candidate_Name=By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']/descendant::label[text()='Candidate Name']/following::input[@placeholder='Type for hints...']");
	//page Actions
	public Recruitment_Page(WebDriver driver) {
		this.driver=driver;
	}
	public String checkVacancy() {	
		driver.findElement(vacancy).click();
		driver.findElement(sel_Vacancy).click();
		return driver.findElement(vacancy_Text).getText();
	}
	public String checkHiring_Mr() throws InterruptedException {
		driver.findElement(hiring_Mr).click();
		driver.findElement(sel_Hiring_Mr).click();
		return driver.findElement(hiring_Text).getText();
	}
	public String checkStatus() {	
		driver.findElement(status).click();
		driver.findElement(status_App).click();
		return driver.findElement(status_Text).getText();
	}
	public String checkJob_Title() {
	
		driver.findElement(job_Title).click();
		driver.findElement(sel_JobTitle).click();
		return driver.findElement(jobTitle_Text).getText();
	}
	public String checkCandidate_Name(String usn) {
		WebElement candiName=driver.findElement(candidate_Name);;
		candiName.sendKeys(usn);
		String text=candiName.getAttribute("value");
		return text;
	}
}