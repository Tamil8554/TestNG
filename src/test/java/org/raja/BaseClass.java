package org.raja;

import java.sql.Date;

import org.apache.poi.common.usermodel.Fill;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static String currentUrl() {
		driver.getCurrentUrl();
		return currentUrl();
	}
    public static String gettitle() {
		driver.getTitle();	
		return gettitle();
	
	    }
    public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}
    public static void close() {
		driver.close();
	}
  public static void dateandtime() {
	java.util.Date d= new java.util.Date();
	System.out.println(d);
}
    public static void click(WebElement name) {
		name.click();
	}
    public static void sleep(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
}

