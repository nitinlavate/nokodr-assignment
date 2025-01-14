package logIn;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.NoKodr_BaseClass;

import PageObjectModel.Login;

public class LoginWithBlankFields extends NoKodr_BaseClass 
{
	@Test
	public void withBlankField() throws InterruptedException
	{
		navigateUrl();
		Login log=new Login(driver);
		
		assertTrue(log.getLogINBtn().isDisplayed(),"i am not in Nokodr login page");
		Reporter.log("i am in login page");
			
		log.clickRememberMe();
		
		assertTrue(log.getLogINBtn().isEnabled(),"Login Button is not enabled");
		Reporter.log("LogIn Button is enabled ");
	
		log.clickLogInBtn();
		
		assertTrue(log.getLogINBtn().isDisplayed(),"Succefuuly Logged in ");
		Reporter.log("Please Enter Email");
		Thread.sleep(3000);
	    closeWeb();
	}
}
