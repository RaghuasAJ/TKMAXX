package com.pages;

import org.openqa.selenium.By;

import com.tkmaxx.PageObjectBaseClass;

public class SearchResultsPage extends PageObjectBaseClass {
	
	public void selectAProduct(){
		driver.findElement(By.cssSelector("#comp-name13331573")).click();
	}

}
