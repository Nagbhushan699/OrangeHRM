package com.orangeHrm.qa.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	//WebElements

	private By menuList=By.className("oxd-main-menu-item-wrapper");
	private By employeeInfo=By.tagName("h5");
	private By addBtn=By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']");
	By leave=By.xpath("//span[text()='Leave']");
	By username=By.xpath("//p[text()='Paul Collings']");
	By pim=By.xpath("//span[text()='PIM']");
	By recruitement_Page=By.xpath("//span[text()='Recruitment']");
	By my_Info=By.xpath("//span[text()='My Info']");
	By admin=By.xpath("//span[text()='Admin']");
	By performance=By.xpath("//span[text()='Performance']");
	By directory=By.xpath("//span[text()='Directory']");
	//Page Actions
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public List<String> menuListIsDisplayed() {
		boolean isDisplay = false;
		List<WebElement>menuItems=driver.findElements(menuList);
		List<String>list=new ArrayList<String>();
		for (WebElement items : menuItems) {
			list.add(items.getText())	;
		}
		return list;	
	}
	public boolean employeeInfo() {
		WebElement EmployeeInfoDisp=driver.findElement(employeeInfo);
		boolean isEmployeeInfoDisp= EmployeeInfoDisp.isDisplayed();
		return isEmployeeInfoDisp;
	}
	public boolean addButtonIsDisplay() {
		WebElement add =driver.findElement(addBtn);
		boolean addbtnIsDisplay=add.isDisplayed();
		return addbtnIsDisplay;  
	}
	public String checkUsername() {
		
		return driver.findElement(username).getText();
	}
	public Leave_Page LeaveIsDisplay() {
		driver.findElement(leave).click();
		return new Leave_Page(driver);
	}
	public PIMPage checkPIMPage() {
		driver.findElement(pim).click();
		return new PIMPage(driver);
		
	}
	public Recruitment_Page check_Recruitement() {
		driver.findElement(recruitement_Page).click();
		return new Recruitment_Page(driver);
	}
	public My_Info_Page check_My_Info() {
		driver.findElement(my_Info).click();
		return new My_Info_Page(driver);
	}
	public Admin_Page check_Admin() {
		driver.findElement(admin).click();
		return new Admin_Page(driver);
	}
	public  Performance_Page check_Performance() {
		driver.findElement(performance).click();
		return new  Performance_Page(driver);
	}
	public  Directory_Page check_Directory() {
		driver.findElement(directory).click();
		return new  Directory_Page(driver);
	}
	public HomePage goBackToHomepage() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		return new HomePage(driver);
	}
}
