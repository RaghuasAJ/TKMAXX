package com.tkmaxx;

import org.openqa.selenium.WebDriver;

import com.lib.BusinessLib;
import com.lib.SystemLib;
import com.pages.BasketPage;
import com.pages.BillingPage;
import com.pages.CategoryLandingLevel1Page;
import com.pages.CategoryLandingLevel2Page;
import com.pages.DeliveryPage;
import com.pages.HomePage;
import com.pages.MyAccountPage;
import com.pages.PaymentPage;
import com.pages.ProductDetailsPage;
import com.pages.ProductListingPage;
import com.pages.SearchResultsPage;
import com.pages.StoreLocatorPage;

public class PageObjectBaseClass {
	
	public static WebDriver driver;
	
	public static BusinessLib bl=new BusinessLib();
	
	public static SystemLib sl=new SystemLib();
	
	public static BasketPage basketpage=new BasketPage();
	
	public static BillingPage billingpage=new BillingPage();

	public static CategoryLandingLevel1Page catlevel1page= new CategoryLandingLevel1Page();
	
	public static CategoryLandingLevel2Page catlevel2page= new CategoryLandingLevel2Page();
	
	public static DeliveryPage deliverypage = new DeliveryPage();
	
	public static HomePage homepage=new HomePage();
	
	public static MyAccountPage myaccountpage=new MyAccountPage();
	
	public static PaymentPage paymentspage=new PaymentPage();
	
	public static ProductDetailsPage productdetailspage= new ProductDetailsPage();
	
	public static ProductListingPage productlistingpage= new ProductListingPage();
	
	public static SearchResultsPage searchresultspage=new SearchResultsPage();
	
	public static StoreLocatorPage storelocatorpage=new StoreLocatorPage();
	
	
	
	
	
	

}
