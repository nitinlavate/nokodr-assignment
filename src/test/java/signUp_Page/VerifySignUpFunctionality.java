package signUp_Page;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.NoKodr_BaseClass;

import PageObjectModel.ForgetPassword;
import PageObjectModel.SignUp;

public class VerifySignUpFunctionality extends NoKodr_BaseClass
{
	@Test
	public void checkSignUp()
	{
		navigateUrl();
		SignUp sp=new SignUp(driver);
		
		assertTrue(sp.getSignUp().isDisplayed(),"i am not in Nokodr login page");
		Reporter.log("i am in login page");
		
		sp.clickSignUp();
		assertTrue(sp.getSignUpUsingEmail().isDisplayed(),"I am not in Sign Up page");
		Reporter.log("I am in Sign Up page");
		
		closeWeb();
	}
}
