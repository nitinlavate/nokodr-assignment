package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp 
{
	public SignUp(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Sign up")
	private WebElement signUp;
	public void clickSignUp()
	{
		signUp.click();
	}
	public WebElement getSignUp()
	{
		return signUp;
	}
	
	@FindBy(xpath = "//div[text()=' Sign up using Email ']")
	private WebElement SignUpUsingEmail;
	public WebElement getSignUpUsingEmail()
	{
		return SignUpUsingEmail;
	}
	
	@FindBy(xpath = "(//input[@name='username'])[2]")
	private WebElement emailTextfield;
	public void enterIntoEmail(String data)
	{
		emailTextfield.sendKeys(data);
	}
	
	@FindBy(xpath = "//span[@class='slds-checkbox_faux']")
	private WebElement checkbox;
	public void clickCheckbox()
	{
		checkbox.click();
	}
	
	@FindBy(xpath = "(//button[@name='undefined'])[4]")
	private WebElement proceedBtn;
	public void clickProceedBtn()
	{
		proceedBtn.click();
	}
	public WebElement getProccedBtn()
	{
		return proceedBtn;
	}
	
	@FindBy(xpath = "//input[@name='code']")
	private WebElement codeTextfield;
	public WebElement getCodeTextField()
	{
		return codeTextfield;
	}
	
	@FindBy(xpath = "//div[text()=' Please enter a valid email ']")
	private WebElement emailError;
	public WebElement getMailError()
	{
		return emailError;
	}
	
}
