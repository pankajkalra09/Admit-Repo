package SelfService.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardSS {

	public WebDriver driver;
	
	@FindBy(xpath = "//section[@id='MyActivity']//li[@class='button-wrap']/a") WebElement ApplyNow;
	
	public DashboardSS(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public ApplicantInfoPage apply() throws Exception {
		ApplyNow.click();
		Thread.sleep(7000);
		return new ApplicantInfoPage(driver);
	}
}
