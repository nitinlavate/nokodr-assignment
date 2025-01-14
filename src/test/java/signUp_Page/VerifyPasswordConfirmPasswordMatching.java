package signUp_Page;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.NoKodr_BaseClass;

import PageObjectModel.RegisterPage;
import PageObjectModel.SignUp;

public class VerifyPasswordConfirmPasswordMatching extends NoKodr_BaseClass {
 @Test
 public void verifyBothPassword() throws InterruptedException {
	 String emailFormat="@gmail.com";
		navigateUrl();
		SignUp sp=new SignUp(driver);
		
		assertTrue(sp.getSignUp().isDisplayed(),"i am not in Nokodr login page");
		Reporter.log("i am in login page");
		
		sp.clickSignUp();
		assertTrue(sp.getSignUpUsingEmail().isDisplayed(),"I am not in Sign Up page");
		Reporter.log("I am in Sign Up page");
		
		sp.enterIntoEmail("lavatenitin87@gmail.com");
		
		String getEmail = driver.findElement(By.xpath("(//input[@name='username'])[2]")).getText();
		assertTrue(emailFormat.contains(getEmail),"Please enter valid Email");
	
		sp.clickCheckbox();
		
		assertTrue(sp.getProccedBtn().isEnabled(),"Procced Button is not enabled");
		Reporter.log("Procced Button is enabled ");
		
		sp.clickProceedBtn();
		
		assertTrue(sp.getCodeTextField().isDisplayed(),"Verification code not sent");
		Reporter.log("Verification code send successfully");
	
		Thread.sleep(60000); 
		//entermanually code
		
		RegisterPage rp=new RegisterPage(driver);
		rp.enterIntoFirstName("Nirin");
		rp.enterIntoLastName("Lavate");
		rp.enterIntopassword("Nitin@1234");
		rp.enterIntoConfirm_password("Nitin@4321");
		assertTrue(rp.getPassError().isDisplayed());
		Reporter.log("The password and confirmation password do not match");
		Thread.sleep(8000);
		rp.clickRegisterBtn();
		closeWeb();
 }
}
