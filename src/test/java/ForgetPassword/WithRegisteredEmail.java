package ForgetPassword;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.NoKodr_BaseClass;

import FileUtility.FetchDataFromProperty;
import PageObjectModel.ForgetPassword;

public class WithRegisteredEmail extends NoKodr_BaseClass
{
	@Test
	public void WithRegisterdEmail() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		String email_format="@gmail.com";
		navigateUrl();
		ForgetPassword lg=new ForgetPassword(driver);
		
		assertTrue(lg.login().isDisplayed(),"i am not in Nokodr login page");
		Reporter.log("i am in login page");
	 		
		lg.forgetPassword();
	    //data from property file
		lg.EnterIntoEamil(FetchDataFromProperty.fetchData("Email"));
		
		String myEmail = driver.findElement(By.xpath("(//input[@type='email'])[2]")).getText();
		assertTrue(email_format.contains(myEmail),"Please enter valid email");
	 
	   assertTrue(lg.ProccedButton().isEnabled(),"Procced Button is not enabled");
	   Reporter.log("Procced Button is enabled ");
	   
	   lg.Proceed();
	    
	    assertTrue(lg.resendCode().isDisplayed(),"Envalid or expired code");
		Reporter.log("Verification Code sent successfully");
		Thread.sleep(3000);
		closeWeb();
	}
}
