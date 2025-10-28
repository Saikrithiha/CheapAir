package com.app.base;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public BaseClass() {
		WebDriverManager.chromedriver().setup();
	}
	public static WebDriver driver=null;
	
	public static void getDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")==true) {
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")==true) {
			driver = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox")==true) {
			driver = new FirefoxDriver();
		}else {
			System.out.println("Not a valid browser selecting chrome as default browser");
		}
	}
	
	public static void gtUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void sendKeys(WebElement element,String input) {
		element.sendKeys(input);
	}
	
	public static void clickElement(WebElement element) {
		element.click();
	}

}
