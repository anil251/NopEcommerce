package com.automation.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.automation.BaseEngine.BaseClass;



public class ScreenShotUtilities  {
	
	public static String GetFailed_screenShot(String tcname) throws IOException {
		String dateName = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		String repName="Failed-ScreenShot-Report-";
		String imagepath ="H:\\Workspace\\NopEcommerce\\FailedTestScreenshorts\\"+repName+dateName+".jpeg";
		TakesScreenshot takesScreenshot = (TakesScreenshot)BaseClass.getDriver();
		File sourse =takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourse, new File(imagepath));
		return imagepath;
		
		
	}
	public static String GetPassed_screenShot(String tcname) throws IOException {
		String dateName = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		String repName="Passed-ScreenShot-Report-";
		String imagepath ="H:\\Workspace\\NopEcommerce\\Passed_Test_Screenshorts\\"+repName+dateName+".jpeg";
		TakesScreenshot takesScreenshot = (TakesScreenshot)BaseClass.getDriver();
		File sourse =takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourse, new File(imagepath));
		return imagepath;
		
	}
	public static String GetSkiped_screenShot(String tcname) throws IOException {
		String dateName = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		String repName="Skipped-ScreenShot-Report-";
		String imagepath ="H:\\Workspace\\NopEcommerce\\Skiped_Test_Screenshorts\\"+repName+dateName+".jpeg";
		TakesScreenshot takesScreenshot = (TakesScreenshot)BaseClass.getDriver();
		File sourse =takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourse, new File(imagepath));
		return imagepath;
		
	}
	
	

}
