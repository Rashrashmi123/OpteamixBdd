package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static WebDriver driver;

	// locators

	private By usernm = By.xpath("//input[@name = 'username']");

	private By password = By.xpath("//input[@name = 'password']");

	private By login = By.xpath("//button[@type = 'submit']");

	private By forgotpasswd = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");

	private By logo = By.xpath("//div[@class = 'orangehrm-login-branding']");

	// 2. Constructor of the page class:

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {

		return driver.getTitle();

	}

	public boolean isForgotPwdLinkExist() throws InterruptedException {

		Thread.sleep(4000);

		return driver.findElement(forgotpasswd).isDisplayed();

	}

	public void enterUserName(String username) throws InterruptedException {

		Thread.sleep(4000);

		driver.findElement(usernm).sendKeys(username);

	}

	public void enterPassword(String pwd) throws InterruptedException {

		Thread.sleep(4000);

		driver.findElement(password).sendKeys(pwd);

	}

	public void clickOnLogin() {

		driver.findElement(login).click();

	}

}
