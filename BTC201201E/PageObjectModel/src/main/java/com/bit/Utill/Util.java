package com.bit.Utill;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Util {
	public void dropDown() {
		Select s=new Select(null);
		s.selectByValue("3");
		
	}
	public static void comparePriceWithQuantity(WebElement priceElement,WebElement dropdown,List<WebElement>quantities,String num) {
		String otext=priceElement.getText();
		int priceForOneProd=Integer.parseInt(otext.replace("", "$"));
		dropdown.click();
		
		clickOnElementByText(quantities, num);
		String otext1=priceElement.getText();
		int priceForMoreThanOneProd=Integer.parseInt(otext1.replace("", "$"));
		if(priceForOneProd*Integer.parseInt(num)==priceForMoreThanOneProd) {
			System.out.println("price increased");

		}
	}
	public static void verifyPriceDiscount(WebElement orginPriceElement,WebElement discountPricElement,float f) {
		String otext=orginPriceElement.getText();
		String dtext=discountPricElement.getText();
		int orginPrice=Integer.parseInt(otext.replace("", "$"));
		int discountprice=Integer.parseInt(dtext.replace("", "$"));
		Assert.assertTrue(orginPrice*f==discountprice);
		
	}
	public static void clickOnElementByText(List<WebElement>elements,String text) {
		for(WebElement element:elements) {
			if(element.getText().equals(text)) {
				element.click();
				break;
			}
		}
	}
	
	public static void clickOnElementByAttribute(List<WebElement>elements,String attName,String color) {
		for(WebElement element:elements) {
			if(element.getAttribute(attName).equals(color)) {
				element.click();
				break;
			}
		}
	}
	public static void clickOnElementByIndex(List<WebElement>elements,int index) {
		elements.get(index).click();
		
	}
	public static void clickOnElements(WebDriver dr,List<WebElement>elements) {
		for(int i=0;i<elements.size();i++) {
			elements.get(i).click();
			dr.navigate().back();
			
		}
		
	}
	
}
