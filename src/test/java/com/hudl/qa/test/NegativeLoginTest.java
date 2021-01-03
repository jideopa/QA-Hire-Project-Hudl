package com.hudl.qa.test;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hudl.log.base.qa.Base;
import com.hudl.log.utils.qa.UtilsHudl;
import com.hudl.pages.qa.HomePage;
import com.hudl.pages.qa.HudlLoginPage;

@Listeners(com.hudl.qa.test.TestListener.class)
public class NegativeLoginTest extends Base {
	HomePage homepage;
	 HudlLoginPage loginpage;
	
	
	
	
	public NegativeLoginTest() {
		
		super();
	}
	
	
	
	@BeforeMethod
	public void setup() throws Exception {
		
		initialisation();
		loginpage = new HudlLoginPage();
		homepage = new HomePage();
		
		
	
	}
	
	

    @Test(priority=1)
	public void validate_unsucceful_login() throws Exception {
    	testLogger=extent.createTest("Validate unsucceful login");
    	loginpage.enter_credentialAndLogin(props.getProperty("invalidemail"), props.getProperty("validPassword"));
        
    	try {
    	if(homepage.profileicon_Display()) {
    	Assert.fail("fail");
    	System.out.println("unsuccesful login Text passed " + loginpage.get_invalidInputMessage());
    	}
    	else {
    		
    		System.out.println("succesful login Text Failed");
    		
    		
    	}
    	
    	}
    	
    	
    	catch(NoSuchElementException exp2) {

    		
    		
    	}
    	testLogger.addScreenCaptureFromPath(UtilsHudl.Take_Screen_Shot(),"unsuccesful login screen shot");
    }

    
    @AfterMethod
    public void tearDown() {
    	extent.flush();
    	
    	driver.quit();
    }
    
    
	
	
	
	
	

}
