package com.app.pageexe;


import com.app.base.BaseClass;
import com.app.locator.SearchPageLocator;

public class SearchPageExe extends SearchPageLocator{
	public static void driverInit() {
		BaseClass.getDriver("Chrome");
	}
	
	public static void getSource(String src) {
		BaseClass.sendKeys(SearchPageLocator.source("//input[@id='fs_originCity_0']"), src);
	}
	
	public static void getDestination(String dept) {
		BaseClass.sendKeys(SearchPageLocator.destination("//input[@id='fs_originCity_0']"), dept);
	}
	
	public static void getDeptDate(String date) {
		BaseClass.sendKeys(SearchPageLocator.deptDate("//input[@id='fs_originCity_0']"), date);
	}
	
	public static void getSearchFlight() {
		BaseClass.clickElement(SearchPageLocator.searchFlight("//input[@id='fs_originCity_0']"));
	}
}
