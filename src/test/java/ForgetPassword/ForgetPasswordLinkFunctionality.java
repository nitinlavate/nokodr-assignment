package ForgetPassword;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.NoKodr_BaseClass;

import PageObjectModel.ForgetPassword;

public class ForgetPasswordLinkFunctionality extends NoKodr_BaseClass
{
	@Test
	public void checkFunctionality() throws InterruptedException
	{
		navigateUrl();
		ForgetPassword lg = new ForgetPassword(driver);
		
		assertTrue(lg.login().isDisplayed(),"I am not in Login Page");
		Reporter.log("I am in Login Page");
		
		lg.forgetPassword();
		
		assertTrue(lg.ProccedButton().isDisplayed(),"proceed Button Not displayed");
		Reporter.log("Forgot password page navigated successfully");
		
		Thread.sleep(3000);
		closeWeb();
		
	}
}
