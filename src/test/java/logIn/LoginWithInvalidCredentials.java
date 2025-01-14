package logIn;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.NoKodr_BaseClass;

import PageObjectModel.Login;

public class LoginWithInvalidCredentials extends NoKodr_BaseClass
{
	@Test
	public void withValidCredentials() throws InterruptedException
	{
		String emailFormat="@gmail.com";
		String password="Nitin@1829";
		navigateUrl();
		Login log=new Login(driver);
		
		assertTrue(log.getLogINBtn().isDisplayed(),"i am not in Nokodr login page");
		Reporter.log("i am in login page");
		
		log.enterEmail("nitin01@gmail.com");
		
		String getEmail = driver.findElement(By.xpath("//input[@type='email']")).getText();
		assertTrue(emailFormat.contains(getEmail),"Please enter valid Email");
		
		log.enterPassword("Nitin1829");

		assertTrue((password.length()>8),"password length must be at least 8");
		Reporter.log("Password is valid by length");
			
		log.clickRememberMe();
		
		assertTrue(log.getLogINBtn().isEnabled(),"Login Button is not enabled");
		Reporter.log("LogIn Button is enabled ");
	
		log.clickLogInBtn();
		
		assertTrue(log.getLogINBtn().isDisplayed(),"Succefuuly Logged in ");
		Reporter.log("Invalid Email or Password");
		Thread.sleep(3000);
	    closeWeb();
	}
}
