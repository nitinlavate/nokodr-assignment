package basic_Script;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.NoKodr_BaseClass;

import PageObjectModel.ForgetPassword;

public class TC_01_NavigateTO_noKodr_Platform extends NoKodr_BaseClass
{
	@Test
	public void navigateNokodr()
	{
		navigateNokodr();
		
		ForgetPassword lg = new ForgetPassword(driver);
		assertTrue(lg.login().isDisplayed(),"I am not in Login Page");
		Reporter.log("I am in Login Page");
		
		closeWeb();
	}
}
