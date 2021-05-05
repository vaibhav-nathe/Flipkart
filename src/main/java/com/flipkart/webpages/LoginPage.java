package com.flipkart.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;
	@FindBy(how = How.XPATH, using = "//input[@class='_2IX_2- VJZDxU']")
    private WebElement Email;
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
    private WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
    private WebElement button;
    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	private WebElement Search;
    @FindBy(how = How.CLASS_NAME, using = "L0Z3Pu")
    private WebElement SearchClick;
	
	 public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterEmail(String email) throws InterruptedException {
		
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOf(Email));
		 //Thread.sleep(3000);
	        Email.sendKeys(email);

	    }
	    public void enterPassword(String paasword) {
	    	Password.sendKeys(paasword);

	    }
	    public void clickLoginButton() {
	    	button.click();
	    }
	    public void enterInSearch(String name) throws InterruptedException {
			
			  WebDriverWait wait = new WebDriverWait(driver, 20);
			  wait.until(ExpectedConditions.visibilityOf(Search));
			 
		    	//Thread.sleep(5000);
		    	Search.sendKeys(name);
		    }
	    public void clickSearch() {
	    	 WebDriverWait wait = new WebDriverWait(driver, 20);
			  wait.until(ExpectedConditions.visibilityOf(SearchClick));
	    	SearchClick.click();
	    }

}
