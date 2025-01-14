package ForgetPassword;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.NoKodr_BaseClass;

import FileUtility.FetchDataFromExcel;
import PageObjectModel.ForgetPassword;

public class WithInvalidEmailFormat extends NoKodr_BaseClass
{
	@Test
	public void VerifyWithInvalidFormat() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		String email_format="@gmail.com";
		navigateUrl();
		ForgetPassword lg=new ForgetPassword(driver);
		
		assertTrue(lg.login().isDisplayed(),"i am not in Nokodr login page");
		Reporter.log("i am in login page");
	 		
		lg.forgetPassword();
		
	    lg.EnterIntoEamil(FetchDataFromExcel.fetchData("sheet1", 2, 0));
	    
	  
	   assertTrue(lg.ProccedButton().isEnabled(),"Procced Button is not enabled");
	   Reporter.log("Procced Button is enabled ");
	   
	   String myEmail = driver.findElement(By.xpath("(//input[@type='email'])[2]")).getText();
	   assertTrue(email_format.contains(myEmail),"Please enter valid email");
	 	    
	   
	   lg.Proceed();
		
	    assertTrue(lg.verifyEmail().isDisplayed(),"Verification Code sent successfully");
		Reporter.log("User Dose not exits");
		Thread.sleep(3000);
		closeWeb();
	}
}
