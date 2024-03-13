package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_utils.WebDriverUtil;

public class OrganizationsPage extends WebDriverUtil
{
    WebDriverUtil wutil=new WebDriverUtil();
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createorgnization;
	
	




	public WebElement getBtn() {
		return createorgnization;
	}
	
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Organizations() 
	{
		createorgnization.click();
		
		
		
		
	}
	


	
	

}
