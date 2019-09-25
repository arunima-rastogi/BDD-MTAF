package stepDefs;

import cucumber.api.java.en.Given;

public class googleSearch {
	
	@Given("As an endUser i want to search text on google")
	public void mySearch() {
		String testData="null";
		String env = System.getProperty("Env");
		switch(env)
		{
		case "STG": 
			testData="Staging data"; 
			break;
		
		case "INT": testData="Integration data"; break;
		
		default: testData = "Hello world!!";
		}
		workflow.googleSearch obj = new workflow.googleSearch();
		obj.howToSearchGoogle(testData);
	}

}
