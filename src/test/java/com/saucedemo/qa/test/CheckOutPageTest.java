package com.saucedemo.qa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.saucedemo.qa.Constants.Constants;
import com.saucedemo.qa.base.BaseTest;

public class CheckOutPageTest extends BaseTest {

	@BeforeClass
	public void CheckOutPageSetup() {

		productinfopage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		addtocartpage = productinfopage.SelectFromProductList("Sauce Labs Backpack");
		checkoutpage = addtocartpage.doAddToCart();
	}

	@Test(priority = 1)
	public void fillCheckOutInfoTest() {
		checkoutpage.fillCheckOutInfo("kanwar", "Singh", "560032");

	}

	@Test(priority = 2)
	public void checkCheckoutpreviewTest() {
		String Status = checkoutpage.checkCheckoutpreview();
		Assert.assertEquals(Status, Constants.Order_Status);

	}

}
