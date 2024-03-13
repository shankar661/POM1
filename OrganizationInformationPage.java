package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_utils.WebDriverUtil;

public class OrganizationInformationPage
{
	WebDriverUtil wutil=new WebDriverUtil();
	
	
	@FindBy(name="accountname")
	private WebElement organizationnametf;
	
	
	//identify group radio button
		@FindBy(xpath="//input[@value='T']")
		private WebElement groupbtn;
			
			
			//identify dropdown 
			
			
			@FindBy(xpath="//select[@name='assigned_group_id']")
			private WebElement dropdown;
			
			
			//identify the save button
			
			@FindBy(xpath="(//input[@value='  Save  '])[2]")
			private WebElement savebtn;


			public WebElement getOrganizationnametf() {
				return organizationnametf;
			}


			public WebElement getGrpbtn() {
				return groupbtn;
			}


			public WebElement getDropdown() {
				return dropdown;
			}


			public WebElement getSavebtn() {
				return savebtn;
			}
			
			//create a constructor 
			public OrganizationInformationPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//create a method 
			public void organizationinfo(String ornamedata ,String groupdata)
			{
				//enter ogr name
				
				organizationnametf.sendKeys(ornamedata);
				
				//click on radio button
				groupbtn.click();
				
				wutil.handledropdown(dropdown, groupdata);
				
				//click on save button
				savebtn.click();
				
			}

	
		
		
		
	
	

}
