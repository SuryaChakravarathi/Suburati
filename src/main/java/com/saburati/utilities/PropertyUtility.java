package com.saburati.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtility {
	
	private static Properties prop;
	private static File file;
	private static InputStream input;
	
	static {
		try {
			prop = new Properties();
			file = new File("./src/test/resources/PropertyFile/InputData.properties");
			input = new FileInputStream(file);
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
