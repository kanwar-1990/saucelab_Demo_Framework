package com.saucedemo.qa.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.saucedemo.qa.base.BasePage;

public class ProductInfoPage extends BasePage {

	private WebDriver driver;
	private By HeaderButton = By.id("react-burger-menu-btn");
	private By HeaderMenu = By.cssSelector(".bm-item-list a");
	private By HeaderMenuClose = By.id("react-burger-cross-btn");
	private By itemName = By.cssSelector(".inventory_container .inventory_item_name");

	public ProductInfoPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean HeaderCount() {
		driver.findElement(HeaderButton).click();
		List<WebElement> list = driver.findElements(HeaderMenu);
		if (list.size() == 4) {
			return true;
		} else
			return false;

	}

	public List<String> getHeaderDetails() {
		driver.findElement(HeaderButton).click();
		List<String> menulists = new ArrayList<String>();
		List<WebElement> MenuList = driver.findElements(HeaderMenu);

		for (WebElement e : MenuList) {
			String value = e.getText().trim();
			menulists.add(value);
			System.out.println(value);

		}
		driver.findElement(HeaderMenuClose).click();
		return menulists;
	}

	public AddtoCartPage SelectFromProductList(String ProductName) {
		List<WebElement> ItemList = driver.findElements(itemName);
		System.out.println(ItemList.size());

		for (WebElement e : ItemList) {
			if (e.getText().equals(ProductName)) {
				e.click();
				break;
			}

		}
		return new AddtoCartPage(driver);
	}

	public void SortingOnSelectDropDownAlpaanPriceWise(String Name_to_Price_up_down)

	{
		WebElement list = driver.findElement(By.cssSelector("select.product_sort_container"));
		Select select = new Select(list);
		List<WebElement> proposed_list = select.getOptions();

		for (WebElement e : proposed_list) {
			System.out.println(e.getText());

			if (e.getText().equals("Name (Z to A)")) {
				e.click();
				break;
			}
		}
	}

}
