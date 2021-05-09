package com.vti.utils.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SourceProperties {
	private static final String RESOURCE_PATH = "E:\\eclipseworkspace\\Mavenlesson11\\src\\main\\resource\\resource.properties";
	private Properties properties;
	public SourceProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(RESOURCE_PATH));
	}
	public String getValue(String key){
		return properties.getProperty(key);
	}
	
	
}
