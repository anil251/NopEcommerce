package com.automation.Utilities;

import java.io.IOException;






public class PojoReaders {
	private static PropertiesReaders prconf;
	private static PropertiesReaders pror;
	
	public static PropertiesReaders getconfPropertiesReaders() throws IOException{
		 prconf = new PropertiesReaders(FilePaths.configpath);
		return prconf;
		 
	}
	public static PropertiesReaders getorPropertiesReaders() throws IOException{
		pror = new PropertiesReaders(FilePaths.orpath);
		 return pror;
	}

}
