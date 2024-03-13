package basicPom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import common_utils.ExcelUtil;
import common_utils.JavaUtil;
import common_utils.PropertyFileUtil;
import common_utils.WebDriverUtil;
import pom.HomePage;
import pom.LoginPage;

import pom.OrganizationInformationPage;
import pom.OrganizationsPage;



public class BasePage
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		//object creation
		PropertyFileUtil util=new PropertyFileUtil();
		ExcelUtil eutil=new ExcelUtil();
		WebDriverUtil wutil=new WebDriverUtil();
		JavaUtil jutil=new JavaUtil();
		
	//String BROWSER=util.getDataFromPropertyFile("Browser");
	String URL = util.getDataFromPropertyFile("Url");
	String USER = util.getDataFromPropertyFile("Username");
	String PASS=util.getDataFromPropertyFile("Password");
	String ORG=eutil.getDataFromExcel("organizations", 0, 1);
	String assign = eutil.getDataFromExcel("organizations", 1, 1);
	
		
		
		//to launch the browser
		
		/*if (BROWSER.equals("Chrome")) 
		{
			driver=new ChromeDriver();
			
			
		}
		else if (BROWSER.equals("Edge"))
		{
			driver=new EdgeDriver();
			
		}*/
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
		
		
		//create the object of loginPage
		LoginPage lp=new LoginPage(driver);
		lp.Login(USER, PASS);
		
		
		
		
		
		
		//create the object of homaPage
		
		HomePage hp=new HomePage(driver);
		hp.Home();
		//hp.getOrg().click();
		
		
		
		
		OrganizationsPage op=new OrganizationsPage(driver);
	    op.Organizations();
		
		
		
		
		OrganizationInformationPage opi=new OrganizationInformationPage(driver);
		
		opi.organizationinfo(ORG+jutil.getRandomNumber(),assign);
		Thread.sleep(2000);
		hp.Home(driver);
		
	
		
		
		
		
		

		
       
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  

	
	
	
	
	}

}
