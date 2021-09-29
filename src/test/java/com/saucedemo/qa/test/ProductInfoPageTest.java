package com.saucedemo.qa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.saucedemo.qa.Constants.Constants;
import com.saucedemo.qa.base.BaseTest;

public class ProductInfoPageTest extends BaseTest{

	@BeforeClass
	public void ProductInfoSetup()
{
		productinfopage=loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		
}
        
	@Test(priority=1)
	public void getHeaderDetailsTest()
	{
		Assert.assertEquals(productinfopage.getHeaderDetails(),Constants.headerList());
	}
	
	@Test(priority=2)
	public void HeaderCountTest()
	{
		Assert.assertTrue(productinfopage.HeaderCount());
	}
	

	@Test(priority=3)
	
	public void SelectFromDropdownTest()
	{
		productinfopage.SortingOnSelectDropDownAlpaanPriceWise("Name (Z to A)");
	}
	
	@Test(priority=4)
	public void selectProductList()
	{
		productinfopage.SelectFromProductList("Sauce Labs Backpack");									
	}
	
	
}
