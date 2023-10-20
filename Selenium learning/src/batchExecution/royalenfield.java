package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class royalenfield {
	
	@Test(groups = "intg")
	public void toLaunchroyalenfield() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/in/en/motorcycles/bullet-350/campaign/?utm_source=google&utm_medium=cpc&utm_campaign=bullet_in_mc_brand_sep23&utm_term=bullet%20bike&utm_content=broad&gad=1&gclid=EAIaIQobChMIobfxo5f8gQMV2SODAx3YzAQdEAAYASAAEgL-kPD_BwE");
		Reporter.log("royalenfield Done", true);
		driver.quit();
		
		
	}

}
