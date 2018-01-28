package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.tkmaxx.PageObjectBaseClass;



public class ProductDetailsPage extends PageObjectBaseClass{
	
	public void selectQTY()
	{
		Select qty=new Select(driver.findElement(By.cssSelector("#qty")));
		  qty.selectByVisibleText("2");
	}
	public void clickOnAddProductToBasketButton(){
		
		 driver.findElement(By.cssSelector("#addproductbox .js-addproduct")).click();
	}

}
