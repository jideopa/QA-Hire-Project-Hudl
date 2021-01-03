package com.hudl.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hudl.log.base.qa.Base;
import com.hudl.pages.qa.HomePage;
import com.hudl.pages.qa.HudlLoginPage;
@Listeners(com.hudl.qa.test.TestListener.class)

public class HomepageTest extends Base {
	
	 HudlLoginPage loginpage;
	 HomePage homepage;
	
	
	
	public HomepageTest() {
		
		super();
	}
	
	
	
	@BeforeTest
	public void setup() throws Exception {
		
		initialisation();
		// create an pbj for the logging method
		HudlLoginPage loginpage= new HudlLoginPage();
		
		
		homepage =loginpage.enter_credentialAndLogin(props.getProperty("validemail"), props.getProperty("validPassword"));
		 
	}
	
	
	@Test(priority=1)
	public void validate_homeIcon_isDisplay() throws Exception {
		testLogger=extent.createTest("validate_homeIcon_isDisplay");
		
		
		boolean homeIconbtn= homepage.homeicon_isDisplay();
		
		Assert.assertTrue(homeIconbtn, "home Icon is Display");
		
		
		
	}
	
	
	@Test(priority=2)
	public void validate_profile_isDisplay() {
		testLogger=extent.createTest("validate_profile_isDisplay");
		boolean profileIcon= homepage.profileicon_Display();
		Assert.assertTrue(profileIcon,"profile icon is display");
		
		
		
		
		
		
	}
	
	
	@Test(priority=3)
	public void validate_videoLink_isDisplay() {
		testLogger=extent.createTest("validate_videoLink_isDisplay");
		 boolean vidoeLink= homepage.videoLink_Display();
		 Assert.assertTrue(vidoeLink,"video link is display");
		
		
		
		
		
		
	}
	
	@Test(priority=4)
	public void validate_HighligthtLink_isDisplay() {
		testLogger=extent.createTest("validate_HighligthtLink_isDisplay");
		 boolean highLightLink = homepage.HighligthtLink_Display();
		 Assert.assertTrue(highLightLink,"hight Link display");
		
		
		
		
		
		
	}
	
	@Test(priority=5)
	public void validate_reportLink_isDisplay() {
		testLogger=extent.createTest("validate_reportLink_isDisplay");
		 boolean reportLink= homepage.reportLink_Display();
		 Assert.assertTrue(reportLink,"report link display");
		
		
		
		
		
	}
	
   @AfterTest
   public void tearDown() {
	   
	   extent.flush();
	   driver.quit();
	   
   }
	
	
	
	
	
	
}
