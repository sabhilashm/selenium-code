package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KTM {
	@Test(groups = "intg")
	public void toLaunchKTM() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ktm.com/en-in.html");
		Reporter.log("ktm Done", true);
		driver.quit();
		
		
	}

}
