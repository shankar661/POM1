package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_utils.WebDriverUtil;

public class HomePage extends WebDriverUtil
{
	//identify organization
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement organizations;

	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contacts;
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement image;
	
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutbtn;
	
	
	


	public WebElement getOrganizations() {
		return organizations;
	}


	public WebElement getContacts() {
		return contacts;
	}


	public WebElement getImg() {
		return image;
	}
	
		
	public WebElement getSignoutbtn() {
		return signoutbtn;
	}


	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Home()
	{
		//click on orgnation
		
		organizations.click();		
	}
	public void Home(WebDriver driver)
	{
		mousehover(driver,image);
		signoutbtn.click();
	}
	
	
	
	
	
	
	
	
	

}
