package com.saucedemo.qa.page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.saucedemo.qa.base.BasePage;

public class CheckOutPage extends BasePage {

	private WebDriver driver;
	private By FirstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By Pincode = By.id("postal-code");
	private By ContinueBtn = By.id("continue");
	private By PaymentInfo = By.cssSelector(".summary_info div");
	private By FinishBtn = By.id("finish");
	private By OrderSucsMesg = By.cssSelector("#checkout_complete_container h2");

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void fillCheckOutInfo(String firstname, String lastname, String pincode) {
		driver.findElement(FirstName).sendKeys(firstname);
		driver.findElement(lastName).sendKeys(lastname);
		driver.findElement(Pincode).sendKeys(pincode);
		driver.findElement(ContinueBtn).click();
	}

	public String checkCheckoutpreview() {
		List<WebElement> paymentList = driver.findElements(PaymentInfo);
		Iterator<WebElement> list = paymentList.iterator();
		while (list.hasNext()) {
			list.next();
		}

		driver.findElement(FinishBtn).click();
		String SuccessMesg = driver.findElement(OrderSucsMesg).getText();

		return SuccessMesg;
	}

}
