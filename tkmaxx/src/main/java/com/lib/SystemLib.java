package com.lib;

import java.util.concurrent.TimeUnit;

import com.tkmaxx.PageObjectBaseClass;

public class SystemLib extends PageObjectBaseClass{

	public void waitForPageload(){
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
