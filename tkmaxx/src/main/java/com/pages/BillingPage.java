package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.tkmaxx.PageObjectBaseClass;



public class BillingPage extends PageObjectBaseClass{
	
	public void enterAllBillingDetails(){
		Select title=new Select(driver.findElement(By.cssSelector("#title")));
		  title.selectByVisibleText("Mrs");
		  driver.findElement(By.cssSelector("input#fname")).sendKeys("Harshitha");
		  driver.findElement(By.cssSelector("input#lname")).sendKeys("Lingala");
		  
		  Select gender=new Select(driver.findElement(By.cssSelector(".usxtgender .form-select")));
		  gender.selectByVisibleText("Female");
		  
		  Select day=new Select(driver.findElement(By.cssSelector("select[name='remday1']")));
		  day.selectByVisibleText("2");
		  
		  Select month=new Select(driver.findElement(By.cssSelector("select[name='remmonth1']")));
		  month.selectByVisibleText("February");
		  
		  Select year=new Select(driver.findElement(By.cssSelector("select[name='remyear']")));
		  year.selectByVisibleText("1911");
		  
		  Select country=new Select(driver.findElement(By.cssSelector("select[id='cntrylist']")));
		  country.selectByVisibleText("United Kingdom");
		  
		  driver.findElement(By.cssSelector("input[id='zipc']")).clear();
		  driver.findElement(By.cssSelector("input[id='zipc']")).sendKeys("cf23 5ee");
		  
		  driver.findElement(By.cssSelector("#js-lookup-submit-btn")).click();
		  
		  Select address=new Select(driver.findElement(By.cssSelector("select#js-lookupselect")));
		  address.selectByVisibleText("12 NINIAN ROAD, CF23 5EE");
		  
		  
		  
		  driver.findElement(By.cssSelector("input#phone")).clear();
		  driver.findElement(By.cssSelector("input#phone")).sendKeys("07757527583");
		  
		  driver.findElement(By.cssSelector("input#usemail")).clear();
		  driver.findElement(By.cssSelector("input#usemail")).sendKeys("hlingala.tester@gmail.com");
		  
		  driver.findElement(By.cssSelector("input#blkemail")).click();
		  driver.findElement(By.cssSelector("input[value='Agree and Continue']")).click();
		   
	}

}
