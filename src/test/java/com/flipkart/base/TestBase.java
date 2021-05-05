package com.flipkart.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import com.flipkart.webpages.IphoneHandsetList;
import com.flipkart.webpages.LoginPage;



public class TestBase {
	public static WebDriver driver;
	protected LoginPage login;
	protected IphoneHandsetList iphone;
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse_workspace\\Selenium\\io.vinam\\src\\test\\resources\\executable\\chromedriver.exe");
		 login = new LoginPage(driver);
		 iphone = new IphoneHandsetList(driver);
		 
		 
		 driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
        
		login = PageFactory.initElements(driver, LoginPage.class);
	}

}
