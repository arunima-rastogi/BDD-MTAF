package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InstantiateWebDriver {

	private WebDriver driver;

	public synchronized WebDriver getDriver(String driverType) {
		if (driverType == null) {
			return defaultDriver();
		}
		switch (driverType) {
		case "chrome":
			return chromedriver();
		case "firefox":
			return firefoxdriver();
		case "opera":
			return operadriver();
		case "ie":
			return iedriver();
		case "edge":
			return edgedriver();
		case "phantomjs":
			return phantomjs();
		default:
			return defaultDriver();
		}
	}

	private WebDriver iedriver() {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/test/resources/webDrivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		return driver;
	}

	private WebDriver edgedriver() {
		return null;
	}

	private WebDriver phantomjs() {
		return null;
	}

	private WebDriver operadriver() {
		return null;
	}

	private WebDriver defaultDriver() {
		return null;
	}

	private WebDriver chromedriver() {
		System.setProperty("webdriver.chrome.driver", 				System.getProperty("user.dir") + "/src/test/resources/webDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	private WebDriver firefoxdriver() {
		return null;
	}

}
