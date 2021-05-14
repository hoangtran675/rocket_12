package com.vti.FinalExam.utils.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SourceProperties {
	
	private final static String SOURCE_PATH = "src\\main\\resource\\resource.properties";
	private Properties source;
	public SourceProperties() throws FileNotFoundException, IOException {
		source = new Properties();
		source.load(new FileInputStream(SOURCE_PATH));
	}
	public String getValue(String key){
		return source.getProperty(key);
	}
	
}
