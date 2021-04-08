package com.bit.support;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.Utill.Util;

public class CheckOutPage {
	
	private WebDriver dr;
	
	public CheckOutPage (WebDriver m) {
		dr=m;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(id="fghffewfgrhty")
	WebElement priceOne;
	
	@FindBy(id="fghffewfgrhty")
	WebElement drop;
	
	@FindBy(xpath="xpath of submenu")
	List<WebElement> quantities;
	
	public void increaseQuantity(String num) {
		Util.comparePriceWithQuantity(priceOne, drop, quantities,num);
	}
}
