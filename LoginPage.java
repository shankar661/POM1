package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//identify username tf
	@FindBy(name="user_name")
	private WebElement usernametf;
	
	
	
	//identify password tf
	
	@FindBy(name="user_password")
	private WebElement passwordtf;
	
	
	
	//identify login tf
	@FindBy(id="submitButton")
	private WebElement loginbtn;



	public WebElement getUsernametf() {
		return usernametf;
	}



	public WebElement getPasstf() {
		return passwordtf;
	}



	public WebElement getSubmittf() {
		return loginbtn;
	}
	//create a constructor-initialize 
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//create a method
	
	public void Login(String usernamedata,String passworddata)
	{
		usernametf.sendKeys(usernamedata);
		passwordtf.sendKeys(passworddata);
		loginbtn.click();
		
	}


	
	
	
	

}
