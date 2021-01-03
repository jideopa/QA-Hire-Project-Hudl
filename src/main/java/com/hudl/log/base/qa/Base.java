package com.hudl.log.base.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.hudl.log.utils.qa.UtilsHudl;

public class Base {
	public static WebDriver driver;
	public static Properties props;
	public static ExtentReports extent;
	public static ExtentTest testLogger;
	public static ExtentHtmlReporter htmlreporter;
	
	
public Base() {
		
		
		try {
			props=new Properties();
			
			FileInputStream ip= new FileInputStream("/Users/macuser/eclipse-workspace/hudlLogProject/src/main/java/com/hudl/log/config/config.properties");
			props.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		public static void initialisation() throws Exception {
			
			
			
			htmlreporter = new ExtentHtmlReporter("/Users/macuser/eclipse-workspace/hudlLogProject/testReport/hudlReports.html");
			extent= new ExtentReports();
	    	extent.attachReporter(htmlreporter);
				
				System.setProperty("webdriver.chrome.driver","/Users/macuser/Downloads/chromedriver");
				driver = new ChromeDriver();
	
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		  
		  driver.manage().timeouts().implicitlyWait(UtilsHudl.page_load_time,TimeUnit.SECONDS);
	        
		   //Launch the URL
		   driver.get(props.getProperty("url"));
		
		TimeUnit.SECONDS.sleep(10);
		
		
	
		
		
		
		
	
	
	
	

}
	
	
	
	
	
	
	

}
