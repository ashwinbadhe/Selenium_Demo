package Demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigFile {

	//user properties class in java
	Properties properties = new Properties();
	
	// copy the path for cofig.properties file
	String path = "C:\\Users\\Ashwin\\eclipse-workspace\\Selenium\\src\\test\\java\\Demos\\Config.properties";
	
	// create a contractor
	public ReadConfigFile() throws Exception {
		
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
	}
	
	
	// create a method 
	public String GetURL() {
		
		// give the kay which is store under the congi.paroperties file
		String url = properties.getProperty("URI"); 
		if(url!=null) 
			return url;
		else
			throw new RuntimeException("URL is not specified in config file");
			
		}
	
	
       public String Getusernm() {
		
		// give the kay which is store under the congi.paroperties file
		String usernm = properties.getProperty("Username"); 
		if(usernm!=null) 
			return usernm;
		else
			throw new RuntimeException("username is not specified in config file");
			
		}
	
	
        public String Getpasswd() {
		
		// give the kay which is store under the congi.paroperties file
		String passwd = properties.getProperty("Password"); 
		if(passwd!=null) 
			return passwd;
		else
			throw new RuntimeException("password is not specified in config file");
			
		}
	
	}
	
	
