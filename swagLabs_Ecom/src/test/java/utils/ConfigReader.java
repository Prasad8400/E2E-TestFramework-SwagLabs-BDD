package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static Properties properties;

	static {
		try {
			//Fetch file from system
			FileInputStream input = new FileInputStream("src/test/resources/config.properties");

			//Load file and Store/Access it as key value
			properties = new Properties();
			properties.load(input);

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to load config.properties");
		}
	}

	//Fetch value from config.prop based on key
	public static String get(String key) {
		return properties.getProperty(key);
	}
}
