package com.vti.FinalExam.utils.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MessageProperties {
	private final static String SOURCE_PATH = "src\\main\\resource\\message.properties";
	private Properties message;
	public MessageProperties() throws FileNotFoundException, IOException {
		message = new Properties();
		message.load(new FileInputStream(SOURCE_PATH));
	}
	public String getValue(String key){
		return message.getProperty(key);
	}
}
