package com.saucedemo.qa.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {

	public final static String Login_Pagetitle = "Swag Labs";
	public final static String Order_Status="THANK YOU FOR YOUR ORDER";

	public final static List<String> headerList() {
		List<String> list = new ArrayList<String>(Arrays.asList("ALL ITEMS", "ABOUT", "LOGOUT", "RESET APP STATE"));

		return list;
	}
}
