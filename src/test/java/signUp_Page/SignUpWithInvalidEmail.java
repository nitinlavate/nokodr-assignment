package signUp_Page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.NoKodr_BaseClass;

import PageObjectModel.SignUp;

public class SignUpWithInvalidEmail extends NoKodr_BaseClass
{
	@Test
	public void invalidEmail() throws InterruptedException
	{
		String emailFormat="@gmail.com";
		navigateUrl();
		SignUp sp=new SignUp(driver);
		
		assertTrue(sp.getSignUp().isDisplayed(),"i am not in Nokodr login page");
		Reporter.log("i am in login page");
		
		sp.clickSignUp();
		assertTrue(sp.getSignUpUsingEmail().isDisplayed(),"I am not in Sign Up page");
		Reporter.log("I am in Sign Up page");
		
		sp.enterIntoEmail("nitinlawate10@");
		
		assertTrue(sp.getMailError().isDisplayed());
		String getEmail = driver.findElement(By.xpath("(//input[@name='username'])[2]")).getText();
		assertTrue(emailFormat.contains(getEmail),"Please enter valid Email");

		Thread.sleep(3000);
		closeWeb();
	}
}
