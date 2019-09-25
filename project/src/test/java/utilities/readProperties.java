package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readProperties {
	
	public static Properties readProp() throws IOException {
		Properties prop = new Properties();
		InputStream stream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/testData/IntegrationTestData.properties");
		prop.load(stream);
		
		return prop;
	}

	

}
