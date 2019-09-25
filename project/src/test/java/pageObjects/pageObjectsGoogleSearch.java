package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pageObjectsGoogleSearch { 

	WebDriver driver;
	
	public pageObjectsGoogleSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "q")
	WebElement searchBox;

	public String getSearchText() {
		return searchBox.getText();
	}

	public void setSearchBox(String text) {
		searchBox.sendKeys(text);
	}

}
