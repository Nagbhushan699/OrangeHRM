package com.orangeHrm.qa.page;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//page Class
public class LoginPage {
	//	WebElements present on the login page
	//Nonstatic variables
	WebDriver driver;
	private By username=By.name("username");
	private	By password=By.name("password");
	private	By loginButton=By.className("orangehrm-login-button");
	private	By forgotPassword=By.xpath("//p[text()='Forgot your password? ']");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	//page Actions
	public String enterUserName(String userName) {
		driver.navigate().refresh();
		WebElement remove=	driver.findElement(username);
		remove.sendKeys(userName);
		return userName;
	}
	public String enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
		return pass;
	}
	public boolean clickLogin() {
		boolean isDisplay=driver.findElement(loginButton).isDisplayed();
		driver.findElement(loginButton).click();
		return isDisplay;
	}
	public HomePage loginActions(String usn,String pass) {
		enterUserName(usn);
		enterPassword(pass);
		clickLogin();
		return new HomePage(driver);
	}
	public ResetPasswordPage clickForgotPass() {
		driver.findElement(forgotPassword).click();
		return new ResetPasswordPage(driver);
	}
	//	public String getResetText() {
	//		 driver.findElement(forgotPassword).click();
	//		 return 
	//	}

	public LoginPage goToLoginPage()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return new LoginPage(driver);
	}
}
