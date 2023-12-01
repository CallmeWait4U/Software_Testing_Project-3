package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.Utility;

public class DriverInstance {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstance() throws Exception {
		if (Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("msedge")) {
			driver = new EdgeDriver();
			driver.get(Utility.fetchPropertyValue("applicationURL").toString());
			return;
		}
		driver = new ChromeDriver();
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
	}
	
	@AfterMethod
	public void closeDriverInstance() {
		driver.quit();
	}
}
