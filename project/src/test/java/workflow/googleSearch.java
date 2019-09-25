package workflow;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	WebDriver driver;
//"C:\\Browserdrivers_Selenium\\chromedriver.exe");//
	public void howToSearchGoogle(String x) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/webDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // 10 seconds Implicit Wait
		this.driver.manage().window().maximize();
		this.driver.get("http://www.google.co.in");

		pageObjects.googleSearch obj = new pageObjects.googleSearch(driver);
		obj.setSearchBox(x);
		
		driver.quit();
	}

}
