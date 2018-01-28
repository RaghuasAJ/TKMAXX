package com.tkmaxx;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends PageObjectBaseClass{
	
	@BeforeMethod
	public void start(){
		System.setProperty("webdriver.gecko.driver","./src/test/resources/driver/geckodriver/geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("http://www.tkmaxx.com/");
		  driver.manage().window().maximize();
		  sl.waitForPageload();
	}
	
	@AfterMethod
	public void close(){
		driver.quit();
		
	}

}
