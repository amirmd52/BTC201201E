package com.bit.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoesPage {

	private WebDriver dr;
	public ShoesPage(WebDriver h) {
		dr=h;
		PageFactory.initElements(dr, this);
		
	}

}
