package com.automation.BaseEngine;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.automation.Utilities.PojoReaders;
import com.automation.Utilities.ScreenShotUtilities;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	private static String currentdir;
	public static WebDriver driver;
	
	
	private static String tcname;
	private static ExtentTest extentTest;
	private static ExtentReports extentReports;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	
	
	 Properties prop = new Properties();
	 public static Logger logger;
	
	@Parameters({"browser"})
	@BeforeSuite
	public void openbrowser(@org.testng.annotations.Optional("chrome") String browser) throws IOException {
		logger = Logger.getLogger("NopEcommerce");
		currentdir=System.getProperty("user.dir");
		WebDriverManager.chromedriver().setup();
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("Firefox")) {			
			driver= new FirefoxDriver();			
		}
		else if (browser.equals("ie")) {
			driver= new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		getDriver().get(PojoReaders.getconfPropertiesReaders().getValueForKey("baseurl"));
	}
	
	@AfterMethod
	public void AfterTCExcution(ITestResult result) throws IOException {
		if (result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("THE TEST CASE IS SUCCESS : "+result.getName());
			//extentTest.log(LogStatus.PASS, "THE TEST CASE IS PASS :"+tcname);
			ScreenShotUtilities.GetPassed_screenShot(tcname);
			
		}
		if (result.getStatus()==ITestResult.FAILURE) {			 
			System.out.println("THE TEST CASE IS FAILURE :"+result.getName()+"Reason Is : "+result.getThrowable());
			ScreenShotUtilities.GetFailed_screenShot(tcname);
			//extentTest.log(LogStatus.FAIL, "TE TEST CASE IS FAILED :"+tcname);				
			String screenshotPath = ScreenShotUtilities.GetFailed_screenShot(tcname);
			//extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(screenshotPath));			
			//extentTest.log(LogStatus.FAIL,result.getThrowable());
			
		}
		if (result.getStatus()==ITestResult.SKIP) {
			System.out.println("THE TEST CASE IS SKIP :"+result.getName()+"Reason Is : "+result.getThrowable() );
			ScreenShotUtilities.GetSkiped_screenShot(tcname);			
			//extentTest.log(LogStatus.SKIP, "THE TEST CASE IS SKIPED :"+tcname);
			ScreenShotUtilities.GetSkiped_screenShot(tcname);
		}
						
		}

	 
	@AfterSuite
	public void teardown() {
		//driver.quit();
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static ExtentTest getExtentTest() {
		return extentTest;
	}
	public static String getCurrentDir() {
		return currentdir;
	}




	
	
	

}
