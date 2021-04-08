package com.bit.support;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.Utill.Util;

public class TShirtPage {
	WebDriver dr;
	@FindBy(id="fghggewfgrhty")
	WebElement womenLink;
	
	@FindBy(xpath="xpath of products")
	List<WebElement>allTshirtProduct;
	public TShirtPage(WebDriver m) {
		dr=m;
		PageFactory.initElements(dr, this);
	}
	public ProductDetailsPage clickOnAnyProduct() {
		Util.clickOnElementByIndex(allTshirtProduct,0);
		return new ProductDetailsPage();
	}

}
