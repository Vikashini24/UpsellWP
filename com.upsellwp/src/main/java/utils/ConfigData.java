package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigData {
	
	FileInputStream fis;
	Properties property;
	
	public ConfigData() {
		try {
			fis = new FileInputStream("D:\\Eclipse_WorkSpace\\UpsellWP\\com.upsellwp\\src\\main\\java\\resources\\data.properties");
			property = new Properties();
			property.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to load data.properties file");
		}
	}
	
	public String getProperty(String key) {
		String datas = property.getProperty(key);
		return datas;
		
	}
	
}
