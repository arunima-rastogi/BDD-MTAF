package workflow;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class workflowGoogleSearch {

	WebDriver driver;

	public void howToSearchGoogle(String x) {
		Properties prop = null;
		try {
			prop = utilities.readProperties.readProp();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String env = (String) prop.getProperty("browser");
		if (env.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/resources/webDrivers/chromedriver.exe");
			driver = new ChromeDriver();
			this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // 10 seconds Implicit Wait
			this.driver.manage().window().maximize();
			this.driver.get("http://www.google.co.in");
		}else if(env.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "/src/test/resources/webDrivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // 10 seconds Implicit Wait
			this.driver.manage().window().maximize();
			this.driver.get("http://www.google.co.in");
			
		}

		pageObjects.pageObjectsGoogleSearch obj = new pageObjects.pageObjectsGoogleSearch(driver);
		obj.setSearchBox(prop.getProperty("textToSearch"));

		driver.quit();
	}

}
