package AdministrationTC;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import AdmPages.ProspectsViewRecords;

public class GetInstNname {
	
	public WebDriver driver;
	//public static Logger log = Logger.getLogger(ProspectsViewRecords.class.getName());
	
	@FindBy(xpath = "//div[@id='menu-center']/ul/li/a") WebElement listname;
	@FindBy(xpath = "//*[@id=\"menu-block\"]/li[6]/a/span") WebElement Settings;
	@FindBy(xpath = "//*[@id=\"sidebarGroup2123100347a764d6c\"]/a") WebElement InstitutionalDefault;
	
	
	
	public GetInstNname(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void InstitutionalDefaultPae() throws Exception {
		Settings.click();
		Thread.sleep(3000);
		InstitutionalDefault.click();
		Thread.sleep(5000);
		List<WebElement> listitems = driver.findElements(By.xpath("//div[@id='menu-center']/ul/li/a"));		
		  Iterator<WebElement> crunchifyIterator = listitems.iterator(); 
		  while (crunchifyIterator.hasNext()) 
		  { 
			  	WebElement element = crunchifyIterator.next();
			  	Thread.sleep(2000); 
			  	System.out.println(element.getText());
				Thread.sleep(3000); 
			  }	}
	
	
}
