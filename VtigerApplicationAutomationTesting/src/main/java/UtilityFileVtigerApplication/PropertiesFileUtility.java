package UtilityFileVtigerApplication;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class consist of generic method reloaded to properties file
 * @author Devashis
 */
public class PropertiesFileUtility {
	
	/**
	 * This method will read data from properties file based on the key given by caller and return the value to caller
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readStringDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommanData.properties");
		Properties properties=new Properties();
		properties.load(fis);
		String value=properties.getProperty(key);
		return value;
	}
	public int readIntegerDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommanData.properties");
		Properties properties=new Properties();
		properties.load(fis);
		int value = Integer.parseInt(properties.getProperty(key));
		return value;
	}
}
