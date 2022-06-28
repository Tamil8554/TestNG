package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CrossBrowser {
	public static WebDriver driver;
    @Parameters({"Browser"})
	@Test
	private void tc1(String browName) {
		if (browName.startsWith("chr")) {
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();			
		}
		else if (browName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
}
