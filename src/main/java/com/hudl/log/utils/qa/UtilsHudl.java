package com.hudl.log.utils.qa;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.hudl.log.base.qa.Base;

public class UtilsHudl extends Base{
	
	
	public  static long page_load_time=10;
	public static long implicit_wait=10;
	
	
	

	public static  String Take_Screen_Shot () {
		
		LocalDateTime getSC_time = LocalDateTime.now();
		DateTimeFormatter getSC_dateformat =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
				
			String formattedDate = getSC_time.format(getSC_dateformat);
			
				
				TakesScreenshot ts=(TakesScreenshot)driver;
				
				
				File source = ts.getScreenshotAs(OutputType.FILE);
		
	String path = System.getProperty("user.dir")+"/Users/macuser/eclipse-workspace/hudlLogProject/testReport"+ "failSC"+formattedDate + ".png";
    File destination= new File(path);
   
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
		
	
}
}
