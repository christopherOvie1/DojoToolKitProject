package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(how= How.XPATH,using ="(//div[@id='programmatic-nested-tabs']//div//a//span)[1]")
    WebElement programmaticNestedTabsRunBtn; 
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	public boolean validatePageURL(String url){
	return	driver.getTitle().equalsIgnoreCase(url);
	}
	
	
	public void clickprogrammaticNestedTabsRunBtn() {
		programmaticNestedTabsRunBtn.click();
	}
}
