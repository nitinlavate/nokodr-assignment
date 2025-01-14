package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	public Login(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	public void enterEmail(String data)
	{
		email.sendKeys(data);
	}
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	public void enterPassword(String data)
	{
		password.sendKeys(data);
	}
	
	@FindBy(id = "rememberMe")
	private WebElement rememberMeCheck;
	public void clickRememberMe()
	{
		rememberMeCheck.click();
	}
	
	@FindBy(xpath = "//div[@title='Log In']")
	private WebElement logInBtn;
	public void clickLogInBtn()
	{
		logInBtn.click();
	}
	public WebElement getLogINBtn()
	{
		return logInBtn;
	}
	
	@FindBy(xpath = "//abx-field[text()='Manage Profile']")
	private WebElement manageProfile;
	public WebElement getManageProfile()
	{
		return manageProfile;
	}
}
