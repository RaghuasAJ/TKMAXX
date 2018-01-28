package com.tkmaxx;


import org.testng.annotations.Test;

public class AllTestCases extends Hooks{
	
	@Test
	public void serchWithValidData()
	{
		sl.waitForPageload();
		bl.enterTheSearchValue();
		bl.clickOnSearchButton();

	}
	@Test 
	 public void guestCustomer_standardFindAddress(){
		sl.waitForPageload();
		bl.enterTheSearchValue();
		bl.clickOnSearchButton();
		sl.waitForPageload();
		searchresultspage.selectAProduct();
	  	productdetailspage.selectQTY();
	  	sl.waitForPageload();
	  	productdetailspage.clickOnAddProductToBasketButton();
	  	sl.waitForPageload();	 
	  	bl.selectCheckOutButton();
	  	sl.waitForPageload();	
	    bl.selectGuestCheckoutOptionInCheckoutPage();
	    sl.waitForPageload();
	    billingpage.enterAllBillingDetails();
	  
	  
	 }
	
	

	
}
