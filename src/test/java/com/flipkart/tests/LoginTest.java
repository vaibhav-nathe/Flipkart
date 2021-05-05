package com.flipkart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;

public class LoginTest extends TestBase {



	    @Test
		public void Login() throws InterruptedException{
	    	
	    	login.enterEmail("vaibhav.nathe@gmail.com");
	    	login.enterPassword("Vn@11006020");
	    	login.clickLoginButton();
	    	Thread.sleep(4000);
	    	login.enterInSearch("iPhone");
	    	login.clickSearch();
	
		}
}

