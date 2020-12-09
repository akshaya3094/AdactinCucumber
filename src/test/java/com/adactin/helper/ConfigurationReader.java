package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		File fileInput = new File("src\\test\\java\\com\\adactin\\property\\Adactin.property");
		FileInputStream inputStream = new FileInputStream(fileInput);
		p = new Properties();
		p.load(inputStream);
	}
	
	public String getBrowserName() {
		String browserName = p.getProperty("BrowserName");
		return browserName;
	}
	
	public String getPageUrl() {
		String pageUrl = p.getProperty("Url");
		return pageUrl;
	}
	

}
