package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowPage {
	public static WebDriver driver;

	// locators

	private By tab = By.xpath("//a[@id='opentab']");

	private By childtext = By.xpath("//div[@class='cont']//span[contains(text(),'info@qaclickacademy.com')]");

	public WindowPage(WebDriver driver) {

		WindowPage.driver = driver;

	}

	public void tab() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(tab).click();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);

		// get all window handles

		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		// iterate among the windows

		Iterator<String> iterator = windowhandles.iterator();
		while (iterator.hasNext()) {
			String childwindow = iterator.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				Thread.sleep(3000);
				driver.switchTo().window(childwindow);

			}

		}

	}

	public String gettext() {

		return driver.findElement(childtext).getText();

	}

}
