package com.automation.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class PropertiesReaders  {
	public static Properties prop ;
	public static FileInputStream fis;
	private static String value;
	
	private String filepath;
	
	
	public  PropertiesReaders(String filepath) throws IOException {
		this.filepath= filepath;
		
		
		fis = new FileInputStream(filepath);
		prop = new Properties();
		Optional<Properties> optional = Optional.ofNullable(prop);
	     if (optional.isPresent()) {
	    	 prop.load(fis);			
		}
	     else {
			System.out.println("Properties Objects Pointing To Null");
		}
		
		
	}
	public String getValueForKey(String key) {
		value = prop.getProperty(key);
		return value;
		
	}

	
	
}
