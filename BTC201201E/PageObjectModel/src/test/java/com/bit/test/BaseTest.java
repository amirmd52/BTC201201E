package com.bit.test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public WebDriver dr;
	
	@Before
	public void start() throws IOException{
		
		String x=System.getProperty("browser");
		String y=System.getProperty("runMode");
		
		if(x.equals("Firefox")) {
			if(y.equals("local")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\amirm\\Downloads\\geckodriver-v0.28.0-win64");
				dr=new FirefoxDriver();
				
			}
			else if(y.equals("remote")) {
				System.out.println("Run the test remotely");
			}
		}
		else if(x.equals("Chrome")) {
			if(y.equals("local")) {
				System.getProperty("webdriver.chrome.driver", "C:\\Users\\amirm\\Downloads\\chromedriver.exe");
				
			}
			else if(y.equals("remote")) {
				System.out.println("Run the test remotely");
			}
			dr.get("http://www.banhladesh.com");
		}
		}
		@After
		public void end() throws InterruptedException{
			Thread.sleep(5000);
			dr.quit();
		
	}

}
