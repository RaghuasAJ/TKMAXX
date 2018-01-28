package com.lib;

import org.openqa.selenium.By;

import com.tkmaxx.PageObjectBaseClass;

public class BusinessLib extends PageObjectBaseClass{
	
	public void  clickOnSearchButton(){
		
		driver.findElement(By.cssSelector("#searchsubmit")).click();
	}
	
	public void enterTheSearchValue()
	{
		driver.findElement(By.cssSelector("input[type='search']")).clear();
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("sunglasses");
	}
	
	public void selectCheckOutButton(){
		driver.findElement(By.cssSelector(".notifyBox .checkout-button")).click();
	}
	
	public void selectGuestCheckoutOptionInCheckoutPage(){
		 driver.findElement(By.cssSelector("#guestcustomer a")).click();
	}
	

}
