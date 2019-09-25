package workflow;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilities.InstantiateWebDriver;

public class workflowGoogleSearch {

	WebDriver driver;

	public void howToSearchGoogle(String x) {
		InstantiateWebDriver wd = new InstantiateWebDriver();
		this.driver = wd.getDriver(System.getProperty("browser"));
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		this.driver.manage().window().maximize();
		this.driver.get("http://www.google.co.in");
		


		pageObjects.pageObjectsGoogleSearch obj = new pageObjects.pageObjectsGoogleSearch(driver);
		obj.setSearchBox("jackychan");

		driver.quit();
	}

}
