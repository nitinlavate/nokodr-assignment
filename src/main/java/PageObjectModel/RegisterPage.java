package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "(//input[@type=\"text\"])[1]")
	private WebElement first_name;
	public void enterIntoFirstName(String data)
	{
	   first_name.sendKeys(data);
	}
	
	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	private WebElement last_name;
	public void enterIntoLastName(String data)
	{
	   last_name.sendKeys(data);
	}
	
	@FindBy(xpath = "//div[text()='Register']")
	private WebElement RegisterBtn;
	public void clickRegisterBtn()
	{
	   RegisterBtn.click();
	}
	
	public WebElement getRegisterBtn()
	{
	  return RegisterBtn;
	}
	
	@FindBy(xpath = "(//input[@type=\"password\"])[2]")
	private WebElement Password;
	public void enterIntopassword(String data)
	{
	   Password.sendKeys(data);
	}
	
	
	@FindBy(xpath = "(//input[@type=\"password\"])[3]")
	private WebElement Confirm_Password;
	public void enterIntoConfirm_password(String data)
	{
	   Confirm_Password.sendKeys(data);
	}
	
	@FindBy(className = "slds-form-element__help")
	private WebElement passwordError;
	public WebElement getPassError() {
		return passwordError;
	}
	
	@FindBy(className = "slds-form-element__help")
	private WebElement Error;
	public WebElement getSpecialCharErr() {
		return Error;
	}
}
