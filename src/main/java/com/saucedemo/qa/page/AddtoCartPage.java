package com.saucedemo.qa.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.saucedemo.qa.base.BasePage;

public class AddtoCartPage extends BasePage {
	private WebDriver driver;

	private By ProductDetails = By.cssSelector(".inventory_details_desc_container div");
	private By AddToCartBttn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By CartCheck = By.cssSelector("a.shopping_cart_link");
	private By CheckOut = By.cssSelector("#checkout");
	private By CheckOutMesg=By.linkText("Checkout: Your Information");

	public AddtoCartPage(WebDriver driver) {
		this.driver = driver;
	}

	public List<String> getProductDetails() {

		List<String> Lists = new ArrayList<String>();
		List<WebElement> productlist = driver.findElements(ProductDetails);

		for (WebElement e : productlist) {
			System.out.println((e.getText()));
			Lists.add(e.getText());

		}

		return Lists;

	}

	public CheckOutPage doAddToCart() {
		driver.findElement(AddToCartBttn).click();
		driver.findElement(CartCheck).click();
		driver.findElement(CheckOut).click();
	//String Checkoutheader=driver.findElement(CheckOutMesg).getText();
	
//	if(Checkoutheader.contains("Your Information"))
//	{
//		return true;
//	}else
//		return false;
//	}
	
	return new CheckOutPage(driver);
	}

}
