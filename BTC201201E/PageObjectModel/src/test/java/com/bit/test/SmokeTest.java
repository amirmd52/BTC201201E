package com.bit.test;

import java.io.IOException;

import org.junit.Test;

import com.bit.support.CheckOutPage;
import com.bit.support.HomePage;
import com.bit.support.MenPage;
import com.bit.support.ProductDetailsPage;
import com.bit.support.ShoesPage;
import com.bit.support.TShirtPage;
import com.bit.support.WomenPage;

public class SmokeTest extends BaseTest {
	
	MenPage mp;
	TShirtPage tp;
	ProductDetailsPage pdp;
	WomenPage wp;
	ShoesPage sp;
	CheckOutPage cp;
	
	@Test
	public void test1() {
		System.out.println("Test 1 execute");
		
		HomePage homePage=new HomePage(dr);
		homePage.verifyHomePageTitle();
		mp=homePage.clickMenPage();
		tp = mp.clickOnTshirt();
		pdp=tp.clickOnAnyProduct();
		pdp.verifyPrice();
		pdp.selectcolor();
		pdp.selectSize();
		pdp.clickAddCart();
		cp=pdp.clickViewCart();
		cp.increaseQuantity("3");
		
	}
	@Test
	public void test2() {
		System.out.println("Test 1 execute");
		
		HomePage homePage=new HomePage(dr);
		homePage.verifyHomePageTitle();
		wp=homePage.clickWomenPage();
	}
	public void test3() {
		System.out.println("Test 1 execute");
		HomePage homePage=new HomePage(dr);
		homePage.verifyHomePageTitle();
		sp=homePage.clickShoes();
		
	}

}
