package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class honda {
	@Test(groups = "smoke")
	public void toLaunchhonda() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.honda2wheelersindia.com/");
		Reporter.log("honda Done", true);
		driver.quit();
		
		
	}
	
	
}
