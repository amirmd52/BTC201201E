package com.bit.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver dr;
	public HomePage(WebDriver h) {
		dr=h;
		PageFactory.initElements(dr, this);
		
	}
	@FindBy(how =How.XPATH,using = "") WebElement menLink;
	@FindBy(xpath="") WebElement WomenLink;
	
	public void verifyHomePageTitle() {
		System.out.println(dr.getTitle().contains("online shoping"));
		
	}
	public MenPage clickMenPage() {
		menLink.click();
		return new MenPage(dr);
	}
	public WomenPage clickWomenPage() {
		WomenLink.click();
		return new WomenPage(dr);
	}
	public ShoesPage clickShoes() {
		return new ShoesPage(dr);
	}
}
