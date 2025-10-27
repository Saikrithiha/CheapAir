package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class SearchPageLocator extends BaseClass{
	public static WebElement source(String src) {
		return driver.findElement(By.id(src));
	}
	
	public static WebElement destination(String dest) {
		return driver.findElement(By.id(dest));
	}
	
	public static WebElement deptDate(String date) {
		return driver.findElement(By.id(date));
	}
	
	public static WebElement searchFlight(String search) {
		return driver.findElement(By.id(search));
	}


}
