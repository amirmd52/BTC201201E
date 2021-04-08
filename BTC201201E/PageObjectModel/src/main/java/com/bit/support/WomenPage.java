package com.bit.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
	
	private WebDriver dr;
	public WomenPage(WebDriver h) {
		dr=h;
		PageFactory.initElements(dr, this);
		
	}
	public void verifyWomenPageTitle() {
		
	}

}
