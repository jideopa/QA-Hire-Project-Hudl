package com.hudl.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hudl.log.base.qa.Base;
import com.hudl.pages.qa.HomePage;
import com.hudl.pages.qa.HudlLoginPage;


@Listeners(com.hudl.qa.test.TestListener.class)
public class LoginPageTest extends Base {
	HomePage homepage;
	 HudlLoginPage loginpage;
	
	
	
	
	public LoginPageTest() {
		
		super();
	}
	
	
	
	@BeforeTest
	public void setup() throws Exception {
		
		initialisation();
		loginpage = new HudlLoginPage();
		homepage = new HomePage();
		
		
	
	}
	
	@Test(priority=1)
	public void validate_signup_IsDisplay() {
		testLogger=extent.createTest("Validate sign up link is display");
		
		boolean signup_isDisplay= loginpage.signupIsDisplay();
		Assert.assertTrue(signup_isDisplay,"image display");
		
		
		
	}


     
	@Test(priority=2)
	public void validate_HudlLogo_isDisplayOnlogin() {
		 testLogger=extent.createTest("Validate Hudl logo is display on login");
		boolean logoOnlogin = loginpage.hudlLogoIsDisplaOnLogin();
		
		Assert.assertTrue(logoOnlogin);
	
		
	}
	
	
	
	@Test(priority=3)
    public void validate_logwithOrg_isDisplay() {
		testLogger=extent.createTest("Validate log in with an organisation is displayed ");
		boolean log_org= loginpage.logwithOrg_link_present();
		
		Assert.assertTrue(log_org);
		
		
	}
	
	
	
      @Test(priority=4)
	public void validate_rememberMeLink_isDisplay() {
		
		boolean rememberme= loginpage.rememberMe_IsDisplay();
		
		Assert.assertTrue(rememberme);
		
	}
	   @Test(priority=5)
	public void validate_forgetPassword_IsDisplay() {
		boolean forgotpassword= loginpage.forgotPassword_IsDisplay();
		Assert.assertTrue(forgotpassword);
		
		
		
	}
	
	
	

    @Test(priority=6)
	public void validate_login() throws Exception {
    	testLogger=extent.createTest("Validate login");
    	loginpage.enter_credentialAndLogin(props.getProperty("validemail"), props.getProperty("validPassword"));
    	
    	
    	
    }
	
    @AfterTest
    public void tearDown() {
    	extent.flush();
    	
    	driver.quit();
    }
    
    
	

}
