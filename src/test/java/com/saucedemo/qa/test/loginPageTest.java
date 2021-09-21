package com.saucedemo.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.qa.Constants.Constants;
import com.saucedemo.qa.base.BaseTest;

public class loginPageTest extends BaseTest {

	@Test(priority = 1)
	public void loginpagetitletest() {
		String pagetitle = loginpage.loginPagetitle();
 		Assert.assertEquals(pagetitle, Constants.Login_Pagetitle);

	}

@Test(priority=2)
public void dologinTest()
{
	
	loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
        

}






}

