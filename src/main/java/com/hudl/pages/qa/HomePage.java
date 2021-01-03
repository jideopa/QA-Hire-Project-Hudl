package com.hudl.pages.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hudl.log.base.qa.Base;

public class HomePage extends Base {
	
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement homeIcon;
	
	
	
	@FindBy(xpath ="//span[contains(text(),'Jide O')]")
	WebElement profile;
	
	@FindBy(xpath="//span[contains(text(),'Video')]")
	WebElement video_link;
	
	@FindBy(xpath="//span[contains(text(),'Reports')]")
	WebElement reportLink;
	
	
	@FindBy(xpath="//body/div[@id='ssr-webnav']/div[1]/div[1]/nav[2]/div[3]/a[3]/span[1]")
	 WebElement highlightlink;

	
	public HomePage() {
		
		PageFactory.initElements(driver,this);
	
	}
	
	
	
	public boolean homeicon_isDisplay() throws Exception {
		
		TimeUnit.SECONDS.sleep(10);
		return homeIcon.isDisplayed();
		
	}
	
	
	
	public boolean profileicon_Display() {
		return profile.isDisplayed();
		
	}
	

	public boolean videoLink_Display() {
		return video_link.isDisplayed();
		
	}
	
	
	public boolean reportLink_Display() {
		return reportLink.isDisplayed();
		
	}
	
	
	
	
	public boolean HighligthtLink_Display() {
		return highlightlink.isDisplayed();
		
	}
	
	
	
	
	
	

}
