package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class bajaj {
	@Test(groups = "smoke")
	public void toLaunchbaja() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bajajauto.com/");
		Reporter.log("baja Done", true);
		driver.quit();
		
		
	}

}
