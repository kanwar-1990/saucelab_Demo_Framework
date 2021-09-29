package com.saucedemo.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.saucedemo.qa.base.BaseTest;

public class AddtoCartPageTest extends BaseTest {

	@BeforeClass
	public void AddtoCartPageSetup() {
		productinfopage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

		addtocartpage = productinfopage.SelectFromProductList("Sauce Labs Backpack");
	}

	@Test(priority = 1)
	public void getProductDetailsTest() {
		addtocartpage.getProductDetails();
	}

	@Test(priority = 2)
	public void checkdoAddCart() {
		addtocartpage.doAddToCart();
	}

}
