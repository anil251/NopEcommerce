package com.automation.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.automation.BaseEngine.BaseClass;
import com.automation.Pages.LoginPage;
import com.automation.Utilities.PojoReaders;

public class LoginPageTest extends BaseClass {
	 Properties prop = new Properties();
	 
	
	
	  @Test
	  public void login() throws IOException {
	  LoginPage lp=new LoginPage(driver);	
	  lp.Enter_email(PojoReaders.getconfPropertiesReaders().getValueForKey("email"));	 
	  lp.password(PojoReaders.getconfPropertiesReaders().getValueForKey("password"));
	  //getExtentTest().log(LogStatus.INFO, "Clicking the checkbox");
	  lp.click_checkbox();
	 
	  //getExtentTest().log(LogStatus.PASS, "Clicking the checkbox");
	  lp.submit_click();
	 // getExtentTest().log(LogStatus.PASS, "Clicking the Submit");
	  //lp.logout_click();
	  lp.Customers_Drdn();
	  
	  lp.Customers();
	  //getExtentTest().log(LogStatus.PASS, "Clicking the Customers");
	  lp.Add_New();
	 // getExtentTest().log(LogStatus.PASS, "Clicking the Add NEw");
	  }
	 
	
	
	
	
}
