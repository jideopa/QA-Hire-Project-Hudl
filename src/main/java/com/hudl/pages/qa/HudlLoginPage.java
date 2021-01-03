package com.hudl.pages.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hudl.log.base.qa.Base;

public class HudlLoginPage extends Base {
	
	@FindBy(css="#email")
	WebElement email; 
	
	
	@FindBy(css="#password")
	WebElement password;
	
	
	@FindBy(css="#logIn")
	WebElement login;
	
	@FindBy(css="#logInWithOrganization")
	WebElement loginwithOrg;
	
	@FindBy(xpath="//body/div[2]/form[1]/div[1]/a[1]/*[1]")
	 WebElement hudl_logoOnLogOnLog;
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	WebElement signup;
	
	
	@FindBy(xpath="//label[contains(text(),'Remember me')]")
	WebElement rememberMe;
	
	
	@FindBy(css="#forgot-password-link")
	WebElement forgotPassword;
	
	
	@FindBy(xpath="//body/div[2]/form[1]/div[3]/div[1]/p[1]")
	public static
	WebElement invalidInputMessage;
	public HudlLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean rememberMe_IsDisplay() {
		
		
		return rememberMe.isDisplayed();
	}
	
	public boolean forgotPassword_IsDisplay() {
		
		
		return forgotPassword.isDisplayed();
	}
	
	
	
	public  HomePage enter_credentialAndLogin(String email_text, String password_text) throws Exception {
		
		email.sendKeys(email_text);
		password.sendKeys(password_text);
		login.click();
		 TimeUnit.SECONDS.sleep(15);
		return new HomePage();
      
      
	}
	
	
	public  boolean logwithOrg_link_present() {
		return hudl_logoOnLogOnLog.isDisplayed();
		
	}
	
	
	public  boolean hudlLogoIsDisplaOnLogin() {
		
	
	return hudl_logoOnLogOnLog.isDisplayed();

}
	
	
	public boolean signupIsDisplay() {
		
		
		
		return signup.isDisplayed();
	}
	
	
	public String get_invalidInputMessage() {
		
		
		return invalidInputMessage.getText();
		
		
		
		
	}
	
	
}
