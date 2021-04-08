package com.bit.support;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.bit.Utill.Util;

public class ProductDetailsPage {
	@FindBy(how=How.XPATH,using="")
	WebElement originElement;
	
	@FindBy(how=How.XPATH,using="")
	WebElement addCartButton;
	
	@FindBy(how=How.XPATH,using="")
	WebElement vewCartButton;
	
	@FindBy(xpath = "xpath of products")
	List<WebElement>allcolors;
	
	@FindBy(xpath = "xpath of products")
	List<WebElement>allSize;
	
	@FindBy(xpath = "")
	WebElement disElement;
	
	public void verifyPrice() {
		Util.verifyPriceDiscount(originElement, disElement, .75f);
		
	}
	public void selectcolor() {
		Util.clickOnElementByAttribute(allcolors, "title", "blue");
		
	}
	public void selectSize() {
		Util.clickOnElementByText(allSize, "XL");
	
	}
	public void clickAddCart() {
		addCartButton.click();
		
	}
	public CheckOutPage CheckOutPage(WebElement viewCartButton) {
		viewCartButton.click();
		return new CheckOutPage(null);
	
		
	}
	public CheckOutPage clickViewCart() {
	
		return null;
	}








}
