package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFileData {
	
	private Properties properties;
    public ReadFileData(String propertyFileName) {

        properties= new Properties();
        try {
            properties.load(new FileReader(propertyFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /*
     * Use this to get the property from config file 
     * 
     * @return string
     */
    public String getProperty(String key) {

        String value = properties.getProperty(key);
        if(value == null) {
            try {
                throw new Exception(key + " not found!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return value;
    }
}
