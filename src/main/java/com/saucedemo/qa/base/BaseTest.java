package com.saucedemo.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import com.saucedemo.qa.page.AddtoCartPage;
import com.saucedemo.qa.page.CheckOutPage;
import com.saucedemo.qa.page.ProductInfoPage;
import com.saucedemo.qa.page.loginPage;

public class BaseTest {

	public BasePage basepage;
	public Properties prop;
	public WebDriver driver;
	public loginPage loginpage;
	public ProductInfoPage productinfopage;
	public AddtoCartPage addtocartpage;
	public CheckOutPage checkoutpage;

	@BeforeTest
	public void setup() {

		basepage = new BasePage();

		prop = basepage.init_prop();
		driver = basepage.init_driver("chrome");
		String browser = prop.getProperty("url");
		driver.get(browser);

		loginpage = new loginPage(driver);
		
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
