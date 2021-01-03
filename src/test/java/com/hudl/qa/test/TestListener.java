package com.hudl.qa.test;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.hudl.log.base.qa.Base;
import com.hudl.log.utils.qa.UtilsHudl;


public class TestListener extends Base implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("TEST HAS STARTED " + result.getMethod());
		
	}

	public void onTestSuccess(ITestResult result) {

		
		System.out.println("TEST HAS SUCCESS " + result.getMethod());
		
		
	}

	public void onTestFailure(ITestResult result) {
	
			
	    if(result.getStatus() == ITestResult.FAILURE) {
	
				try {
					testLogger.addScreenCaptureFromPath(UtilsHudl.Take_Screen_Shot());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		
		  
		System.out.println("TEST HAS Fail" + result.getMethod());
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
         
         testLogger.skip(result.getThrowable());
		
        System.out.println("TEST HAS SKIPPED " + result.getMethod());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


}
