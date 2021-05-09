package com.vti.mavenLesson11Class.utils.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DatabaseProperties {
	public static final String RESOURCE_PATH = "E:\\eclipseworkspace\\mavenLesson11Class\\src\\main\\resource\\database.properties";
	private Properties properties;

	public DatabaseProperties() throws FileNotFoundException, IOException {
		this.properties = new Properties();
		properties.load(new FileInputStream(RESOURCE_PATH));

	}

	public String getValue(String key) {
		return properties.getProperty(key);
	}

}
