package com.saucedemo.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saucedemo.qa.base.BasePage;

public class loginPage extends BasePage {

	private WebDriver driver;
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginBth = By.name("login-button");
	private By productpageheader = By.cssSelector(".header_secondary_container span.title");

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	// writing page actions

	public String loginPagetitle() {
		return driver.getTitle();
	}

	public ProductInfoPage doLogin(String usn, String pwd) {
		driver.findElement(username).sendKeys(usn);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBth).click();
//		 String producttitle = driver.findElement(productpageheader).getText();
//		 if (producttitle.equals("Products")) {
//		 return true;
//		 }
//		 return false;
		return new ProductInfoPage(driver);

	}

}
