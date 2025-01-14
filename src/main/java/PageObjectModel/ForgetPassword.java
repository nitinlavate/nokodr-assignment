package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassword
{
	public ForgetPassword(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText ="Forgot Password?")
	private WebElement forgetPassword;
	
	
	@FindBy(xpath  = "(//input[@type='email'])[2]")
	private WebElement Email;
	
	@FindBy(xpath = "//div[@title='Proceed']")
	private WebElement proceed;
	
	@FindBy(xpath = "(//button[@name='undefined'])[1]")
	private WebElement login;
	
	@FindBy(xpath = "//a[contains(text(),'Resend Code')]")
	private WebElement ResendCode;
	
	@FindBy(xpath = "(//span[@title='Email'])[2]")
	private WebElement VerifyEmail;
	
	public void forgetPassword() {
		forgetPassword.click();
	}
	
	public void EnterIntoEamil(String data) {
		Email.sendKeys(data);
	}
	
	
	public WebElement login() {
		return login;
	}
	
	public void Proceed() {
		proceed.click();
	}
	public WebElement ProccedButton() {
		return proceed;
	}
	
	public WebElement resendCode() {
		return ResendCode;
	}
	
	public WebElement verifyEmail() {
		return VerifyEmail;
	}
}
