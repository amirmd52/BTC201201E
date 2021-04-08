package com.bit.support;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.Utill.Util;

public class MenPage {
	private WebDriver dr;
	public MenPage(WebDriver m) {
		dr=m;
		PageFactory.initElements(dr, this);
		

	}
	@FindBy(id="fghggewfagrthy")
	WebElement WomenLink;
	
	@FindBy(xpath="xpath of submenu")
	List<WebElement>menOption;
	public WomenPage clickWomenLink() {
		return new WomenPage(dr);
	}
	
	public TShirtPage clickOnTshirt() {
		Util.clickOnElementByText(menOption,"TSHIRT");
		return new TShirtPage(dr);
	
	}

}
