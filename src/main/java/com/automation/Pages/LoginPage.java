package com.automation.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	
	WebDriver rdriver;
	
	public LoginPage(WebDriver ldriver) {
		rdriver=ldriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(how = How.XPATH,using = "//input[@id='Email']") 
	static WebElement Email;
	
	@FindBy(how = How.XPATH,using = "//input[@id='Password']") 
	static WebElement Pwd;
	
	@FindBy(how = How.XPATH,using = "//input[@id='RememberMe']")
	static WebElement checkbox;
	
	
	@FindBy(how=How.XPATH,using = "//input[@type='submit']")
	static WebElement submit;
	
	@FindBy(how = How.LINK_TEXT,using = "Logout") 
	static WebElement logout;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[2]/div/ul/li[4]/a/span")
	static WebElement customers_drdn;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[2]/div/ul/li[4]/ul/li[1]/a/span")
	static WebElement customers;
	
	@FindBy(how = How.XPATH,using = "//a[@class='btn bg-blue']")
	static WebElement addnew;
	
	Properties prop = new Properties();
	
	
	public  String Enter_email(String email) {
		Email.clear();
		Email.sendKeys(email);	
		
		if (Email.equals(Email)) {
			System.out.println("The Email is Valid");
			
		}
		else {
			System.out.println("The Email is Not Valid ");
		}
		return email;
				
	}
	
	public String password(String password) {
		 Pwd.clear();
		Pwd.sendKeys(password);		
		return password;
		
		
	}
	
	public void click_checkbox() {
		
		checkbox.click();
	}
	
	public void submit_click() {
		submit.click();
	}
	
	public void logout_click() {
		logout.click();
		Email.clear();
		 Pwd.clear();
	}
	
	public void Customers_Drdn() {
		customers_drdn.click();
	}
	
	public void Customers() {
		customers.click();
	}
	public void Add_New() {
		addnew.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
